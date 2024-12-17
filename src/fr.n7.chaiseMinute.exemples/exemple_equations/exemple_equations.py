import sys
import pandas as pd
import numpy

def search(input, out, table, id):
	try:
		return input[table][id].to_list()
	except Exception:
		return out[id].to_list()
 
def load(files):
	"""Load all tables as CSV files. All tables must have a corresponding CSV file with the same name in working dir."""
	input = {}	
	for filename in files:
		name = filename.rsplit(".",1)[0]
		input[name] = pd.read_csv(filename)

	return input

def check_constraints(input):
	"""Ensure all contraints are respected in input and output data"""
	################################
	# Verifying Input Constraints
	################################
	### Apply ensure_is_not_null ##
	from ensure_is_not_null import ensure_is_not_null
	res = ensure_is_not_null(
		input["table"]["a"].to_list(),
	)
	
	if not res:
		return (False,("ensure_is_not_null constraints failed"))

	################################
	# Verifying Table Constraints
	################################
	out = generate_output(input)

	### Verify data types
	for x in out["equations"]["Solution"]:
		break
	for x in out["equations"]["delta"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on equations.delta")

	for x in out["equations"]["a"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on equations.a")

	for x in out["equations"]["b"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on equations.b")

	for x in out["equations"]["c"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on equations.c")


	return (True, "Constraints are respected")

def generate_output(input):
	"""Returns a Dict<TableName, Dict<ColumnName, Data>> by applying the the model on the input data."""
	tables = {}
	out = {}
	###########################################################################
	# Table: equations
	###########################################################################
	### Imported column: a from table.a ###
	out["a"]=input["table"]["a"]

	### Imported column: b from table.b ###
	out["b"]=input["table"]["b"]

	### Imported column: c from table.c ###
	out["c"]=input["table"]["c"]

	################################			
	## Computed column: Solution 
	################################
	### Apply compute_delta ##
	from compute_delta import compute_delta
	out["Solution"] = compute_delta(
		search(input, out, "equations", "a"),
		search(input, out, "equations", "b"),
		search(input, out, "equations", "c"),
	)
	###############
	### Apply solve ##
	from solve import solve
	out["Solution"] = solve(
		out["Solution"], # Previous result used in next function
		search(input, out, "equations", "a"),
		search(input, out, "equations", "b"),
		search(input, out, "equations", "c"),
	)
	###############
	################################			
	## Computed column: delta 
	################################
	### Apply compute_delta ##
	from compute_delta import compute_delta
	out["delta"] = compute_delta(
		search(input, out, "equations", "a"),
		search(input, out, "equations", "b"),
		search(input, out, "equations", "c"),
	)
	###############
	tables["equations"] = out

	return tables

def save_to_csv(tables):
	"""Saves each table from he input argument as a CSV file."""
	
	################################
	# Saving to "output_equations.csv" 
	################################
	pd.DataFrame.from_dict(tables["equations"], orient="columns").to_csv("output_"+"equations"+".csv", index_label="Index")

	
def main():
	input = load(sys.argv[1:])
	out = generate_output(input)
	res, msg = check_constraints(input)
	print(msg)
	save_to_csv(out)
	print("Exported files")

if __name__ == '__main__':
	main()

