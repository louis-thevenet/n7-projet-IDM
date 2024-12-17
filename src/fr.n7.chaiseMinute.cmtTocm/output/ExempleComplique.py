import sys
import pandas as pd

def search(input, out, table, id):
	try:
		return input[table][id].to_list()
	except Exception:
		return out[id].to_list()
 
def load():
	"""Load all tables as CSV files. All tables must have a corresponding CSV file with the same name in working dir."""
	input = {}	
	csv_file_path = "table1.csv"
	input["table1"] = pd.read_csv(csv_file_path)
	csv_file_path = "table2.csv"
	input["table2"] = pd.read_csv(csv_file_path)
	return input

def check_constraints(input):
	"""Ensure all contraints are respected in input and output data"""
	################################
	# Verifying Input Constraints
	################################
	### Apply sum ##
	from sum import sum
	res = sum(
		input["table1"]["Un"].to_list(),
		input["table2"]["Deux"].to_list(),
	)
	### Apply ensure_all_lower_than_3 ##
	from ensure_all_lower_than_3 import ensure_all_lower_than_3
	res = ensure_all_lower_than_3(
		res, # Previous result used in next function
	)
	
	if not res:
		return (False,("ensure_all_lower_than_3 constraints failed"))

	################################
	# Verifying Table Constraints
	################################
	out = generate_output(input)

	return True

def generate_output(input):
	"""Returns a Dict<TableName, Dict<ColumnName, Data>> by applying the the model on the input data."""
	tables = {}
	out = {}
	###########################################################################
	# Table: table1
	###########################################################################
	################################
	## Data column: A 
	################################
	out["A"]=input["table1"]["A"]

	################################
	## Data column: B 
	################################
	out["B"]=input["table1"]["B"]

	################################
	## Data column: C 
	################################
	out["C"]=input["table1"]["C"]

	tables["table1"] = out

	out = {}
	###########################################################################
	# Table: table2
	###########################################################################
	################################
	## Data column: A 
	################################
	out["A"]=input["table2"]["A"]

	################################
	## Data column: B 
	################################
	out["B"]=input["table2"]["B"]

	### Imported column: C from table1.A ###
	out["C"]=input["table1"]["A"]

	################################			
	## Computed column: Sum 
	################################
	### Apply sum ##
	from sum import sum
	out["Sum"] = sum(
		search(input, out, "table1", "A"),
		search(input, out, "table1", "B"),
	)
	###############
	################################			
	## Computed column: Variation 
	################################
	### Apply variation ##
	from variation import variation
	out["Variation"] = variation(
		search(input, out, "table1", "A"),
		search(input, out, "table1", "B"),
	)
	###############
	### Apply variation ##
	from variation import variation
	out["Variation"] = variation(
		out["Variation"], # Previous result used in next function
		search(input, out, "table2", "A"),
	)
	###############
	tables["table2"] = out

	return tables

def save_to_csv(tables):
	"""Saves each table from he input argument as a CSV file."""
	
	################################
	# Saving to "output_table1.csv" 
	################################
	pd.DataFrame.from_dict(tables["table1"], orient="columns").to_csv("output_"+"table1"+".csv", index_label="index")
	
	################################
	# Saving to "output_table2.csv" 
	################################
	pd.DataFrame.from_dict(tables["table2"], orient="columns").to_csv("output_"+"table2"+".csv", index_label="index")

	
def main():
	input = load()
	out = generate_output(input)
	check_constraints(input)
	save_to_csv(out)

if __name__ == '__main__':
	main()
