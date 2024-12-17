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
	### Apply ensure_min_max ##
	from ensure_min_max import ensure_min_max
	res = ensure_min_max(
		input["table"]["Low"].to_list(),
		input["table"]["High"].to_list(),
	)
	
	if not res:
		return (False,("ensure_min_max constraints failed"))

	################################
	# Verifying Table Constraints
	################################
	out = generate_output(input)

	### Verify data types
	for x in out["table"]["Open"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table.Open")
	
	for x in out["table"]["High"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table.High")
	
	for x in out["table"]["Low"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table.Low")
	
	for x in out["table"]["Close"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table.Close")
	
	for x in out["table"]["Adj_Close"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table.Adj_Close")
	
	for x in out["table"]["Volume"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on table.Volume")


	### Verify data types
	for x in out["table2"]["Ouverture"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Ouverture")
	
	for x in out["table2"]["Min"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Min")
	
	for x in out["table2"]["Max"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Max")
	
	for x in out["table2"]["Fermeture"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Fermeture")
	
	for x in out["table2"]["Volume"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on table2.Volume")

	for x in out["table2"]["Moyenne"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Moyenne")
	
	for x in out["table2"]["Variation"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Variation")
	

	return (True, "Constraints are respected")

def generate_output(input):
	"""Returns a Dict<TableName, Dict<ColumnName, Data>> by applying the the model on the input data."""
	tables = {}
	out = {}
	###########################################################################
	# Table: table
	###########################################################################
	################################
	## Data column: Open 
	################################
	out["Open"]=input["table"]["Open"]

	################################
	## Data column: High 
	################################
	out["High"]=input["table"]["High"]

	################################
	## Data column: Low 
	################################
	out["Low"]=input["table"]["Low"]

	################################
	## Data column: Close 
	################################
	out["Close"]=input["table"]["Close"]

	################################
	## Data column: Adj_Close 
	################################
	out["Adj_Close"]=input["table"]["Adj_Close"]

	################################
	## Data column: Volume 
	################################
	out["Volume"]=input["table"]["Volume"]

	tables["table"] = out

	out = {}
	###########################################################################
	# Table: table2
	###########################################################################
	### Imported column: Ouverture from table.Open ###
	out["Ouverture"]=input["table"]["Open"]

	### Imported column: Min from table.Low ###
	out["Min"]=input["table"]["Low"]

	### Imported column: Max from table.High ###
	out["Max"]=input["table"]["High"]

	### Imported column: Fermeture from table.Close ###
	out["Fermeture"]=input["table"]["Close"]

	### Imported column: Volume from table.Volume ###
	out["Volume"]=input["table"]["Volume"]

	################################			
	## Computed column: Moyenne 
	################################
	### Apply mean ##
	from mean import mean
	out["Moyenne"] = mean(
		search(input, out, "table", "Min"),
		search(input, out, "table", "Max"),
	)
	###############
	################################			
	## Computed column: Variation 
	################################
	### Apply variation ##
	from variation import variation
	out["Variation"] = variation(
		search(input, out, "table", "Fermeture"),
		search(input, out, "table", "Ouverture"),
	)
	###############
	tables["table2"] = out

	return tables

def save_to_csv(tables):
	"""Saves each table from he input argument as a CSV file."""
	
	################################
	# Saving to "output_table.csv" 
	################################
	pd.DataFrame.from_dict(tables["table"], orient="columns").to_csv("output_"+"table"+".csv", index_label="Date")
	
	################################
	# Saving to "output_table2.csv" 
	################################
	pd.DataFrame.from_dict(tables["table2"], orient="columns").to_csv("output_"+"table2"+".csv", index_label="Date")

	
def main():
	input = load(sys.argv[1:])
	out = generate_output(input)
	res, msg = check_constraints(input)
	print(msg)
	save_to_csv(out)
	print("Exported files")

if __name__ == '__main__':
	main()

