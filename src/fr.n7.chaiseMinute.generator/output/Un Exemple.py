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

	out["A"]=content["table1"]["A"]

	out["B"]=content["table1"]["B"]

	pd.DataFrame.from_dict(out, orient="columns").to_csv("output_"+"table1"+".csv", index_label="index")
	out = {}

	out["C"]=content["table2"]["C"]

	out["B"]=content["table2"]["B"]

	# Looking for table1.B 
	out["A"]=content["table1"]["B"]

		
	pd.DataFrame.from_dict(out, orient="columns").to_csv("output_"+"table2"+".csv", index_label="index2")
	
if __name__ == '__main__':
	main()

