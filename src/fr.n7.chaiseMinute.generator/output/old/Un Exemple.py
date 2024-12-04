import sys
import pandas as pd

def main():
# Load files
	content = {}	
	csv_file_path = "table1.csv"
	content["table1"] = pd.read_csv(csv_file_path)
	csv_file_path = "table2.csv"
	content["table2"] = pd.read_csv(csv_file_path)

	out = {}

	#### Table: table1 ####

	### Data column: A ###
	out["A"]=content["table1"]["A"]
	### Data column: B ###
	out["B"]=content["table1"]["B"]
	### Computed column: C ###
	from Sum import Sum
	out["C"] = Sum(
		content["table1"]["A"].to_list(),
		content["table1"]["B"].to_list(),
	)


	pd.DataFrame.from_dict(out, orient="columns").to_csv("output_"+"table1"+".csv", index_label="index")
	################
	out = {}

	#### Table: table2 ####

	### Data column: C ###
	out["C"]=content["table2"]["C"]
	### Data column: B ###
	out["B"]=content["table2"]["B"]
	### Imported column: A from table1.B ###
	out["A"]=content["table1"]["B"]

	pd.DataFrame.from_dict(out, orient="columns").to_csv("output_"+"table2"+".csv", index_label="index2")
	################
	
if __name__ == '__main__':
	main()

