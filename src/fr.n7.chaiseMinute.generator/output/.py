import sys
import pandas as pd

def main():
# Load files
	content = {}	
	csv_file_path = "table.csv"
	content["table"] = pd.read_csv(csv_file_path)

	out = {}

	#### Table: table ####

	### Imported column: Ouverture from input.Open ###
	out["Ouverture"]=content["input"]["Open"]
	
	### Imported column: Min from input.Low ###
	out["Min"]=content["input"]["Low"]
	
	### Imported column: Max from input.Low ###
	out["Max"]=content["input"]["Low"]
	
	### Imported column: Fermeture from input.Close ###
	out["Fermeture"]=content["input"]["Close"]
	
	### Data column: Volume ###
	out["Volume"]=content["table"]["Volume"]
	
	

	
	

	




	pd.DataFrame.from_dict(out, orient="columns").to_csv("output_"+"table"+".csv", index_label="Date")
	################
	
if __name__ == '__main__':
	main()

