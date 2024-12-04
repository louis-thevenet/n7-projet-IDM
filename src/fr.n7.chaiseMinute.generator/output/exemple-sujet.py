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
	csv_file_path = "table.csv"
	content["table"] = pd.read_csv(csv_file_path)

	out = {}

	#### Table: table ####

	### Imported column: Ouverture from table.Open ###
	out["Ouverture"]=content["table"]["Open"]
	### Imported column: Min from table.Low ###
	out["Min"]=content["table"]["Low"]
	### Imported column: Max from table.High ###
	out["Max"]=content["table"]["High"]
	### Imported column: Fermeture from table.Close ###
	out["Fermeture"]=content["table"]["Close"]
	### Data column: Volume ###
	out["Volume"]=content["table"]["Volume"]
	### Computed column: Moyenne ###

	from mean import mean
	out["Moyenne"] = mean(
						internal_or_external(out, content, "table", "Min"),
						internal_or_external(out, content, "table", "Max"),
		)
	### Computed column: Variation ###

	from variation import variation
	out["Variation"] = variation(
						internal_or_external(out, content, "table", "Fermeture"),
						internal_or_external(out, content, "table", "Ouverture"),
		)


	pd.DataFrame.from_dict(out, orient="columns").to_csv("output_"+"table"+".csv", index_label="Date")
	################
	
if __name__ == '__main__':
	main()

