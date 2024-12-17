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
	csv_file_path = "table.csv"
	input["table"] = pd.read_csv(csv_file_path)
	return input

def check_constraints(input):
	"""Ensure all contraints are respected in input and output data"""
	################################
	# Verifying Input Constraints
	################################

	################################
	# Verifying Table Constraints
	################################
	out = generate_output(input)

	### Apply ensure_min_max ##
	from ensure_min_max import ensure_min_max
	res = ensure_min_max(
		search(input, out, "table", "Low"),
		search(input, out, "table", "High"),
	)

	if not res:
		return (False, "ensure_min_max constraints failed on table")
	return (True, "Constraints are respected")

def generate_output(input):
	"""Returns a Dict<TableName, Dict<ColumnName, Data>> by applying the the model on the input data."""
	tables = {}
	out = {}
	###########################################################################
	# Table: table
	###########################################################################
	### Imported column: Ouverture from table.Open ###
	out["Ouverture"]=input["table"]["Open"]

	### Imported column: Min from table.Low ###
	out["Min"]=input["table"]["Low"]

	### Imported column: Max from table.High ###
	out["Max"]=input["table"]["High"]

	### Imported column: Fermeture from table.Close ###
	out["Fermeture"]=input["table"]["Close"]

	################################
	## Data column: Volume 
	################################
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
	tables["table"] = out

	return tables

def save_to_csv(tables):
	"""Saves each table from he input argument as a CSV file."""
	
	################################
	# Saving to "output_table.csv" 
	################################
	pd.DataFrame.from_dict(tables["table"], orient="columns").to_csv("output_"+"table"+".csv", index_label="Date")

	
def main():
	input = load()
	out = generate_output(input)
	res, msg = check_constraints(input)
	print(msg)
	save_to_csv(out)

if __name__ == '__main__':
	main()

