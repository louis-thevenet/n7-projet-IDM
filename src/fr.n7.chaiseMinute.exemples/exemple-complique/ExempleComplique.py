import sys
import pandas as pd

def internal_or_external(intern, extern, table, id):
	if intern[id].to_list() == None:
		return extern[table][id].to_list()
	else:
		return intern[id].to_list()


def main():
# Load files
	content = {}	
	csv_file_path = "table1.csv"
	content["table1"] = pd.read_csv(csv_file_path)
	csv_file_path = "table2.csv"
	content["table2"] = pd.read_csv(csv_file_path)

	out = {}
	###########################################################################
	# Table: table1
	###########################################################################
	################################
	## Data column: A 
	################################
	out["A"]=content["table1"]["A"]

	################################
	## Data column: B 
	################################
	out["B"]=content["table1"]["B"]

	################################
	## Data column: C 
	################################
	out["C"]=content["table1"]["C"]


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
	out["A"]=content["table2"]["A"]

	################################
	## Data column: B 
	################################
	out["B"]=content["table2"]["B"]

	### Imported column: C from table1.A ###
	out["C"]=content["table1"]["A"]

	################################
	## Computed column: Sum 
	################################
	### Apply sum ##
	from sum import sum
	out["Sum"] = sum(
		internal_or_external(out, content, "table1", "A"),
		internal_or_external(out, content, "table1", "B"),
	)
	###############


	################################
	## Computed column: Variation 
	################################
	### Apply variation ##
	from variation import variation
	out["Variation"] = variation(
		internal_or_external(out, content, "table1", "A"),
		internal_or_external(out, content, "table1", "B"),
	)
	###############


	### Apply variation ##
	from variation import variation
	out["Variation"] = variation(
		out["Variation"],
		internal_or_external(out, content, "table2", "A"),
	)
	###############



	################################
	# Saving to "output_table2.csv" 
	################################
	pd.DataFrame.from_dict(out, orient="columns").to_csv("output_"+"table2"+".csv", index_label="index")


	
if __name__ == '__main__':
	main()

