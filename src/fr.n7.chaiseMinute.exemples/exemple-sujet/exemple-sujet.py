import sys
import pandas as pd

def search(input, out, table, id):
	try:
		return input[table][id].to_list()
	except Exception:
		return out[id].to_list()

def main():
	# Load files
	input = {}	
	csv_file_path = "table.csv"
	input["table"] = pd.read_csv(csv_file_path)

	################################
	# Verifying Input Constraints
	################################

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

	################################
	# Verifying Table Constraints
	################################
	### Apply ensure_min_max ##
	from ensure_min_max import ensure_min_max
	res = ensure_min_max(
		search(input, out, "table", "Min"),
		search(input, out, "table", "Max"),
	)
	assert res, ("ensure_min_max constraints failed")

	################################
	# Saving to "output_table.csv" 
	################################
	pd.DataFrame.from_dict(out, orient="columns").to_csv("output_"+"table"+".csv", index_label="Date")

if __name__ == '__main__':
	main()
