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
	csv_file_path = "table1.csv"
	input["table1"] = pd.read_csv(csv_file_path)
	csv_file_path = "table2.csv"
	input["table2"] = pd.read_csv(csv_file_path)

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


	################################
	# Saving to "output_table1.csv" 
	################################
	pd.DataFrame.from_dict(out, orient="columns").to_csv("output_"+"table1"+".csv", index_label="index")
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



	################################
	# Saving to "output_table2.csv" 
	################################
	pd.DataFrame.from_dict(out, orient="columns").to_csv("output_"+"table2"+".csv", index_label="index")

if __name__ == '__main__':
	main()
