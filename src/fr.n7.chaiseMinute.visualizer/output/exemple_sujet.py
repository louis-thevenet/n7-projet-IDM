import sys
import pandas as pd
import tkinter as tk
from tkinter import ttk, filedialog

def search(input, out, table, id):
	try:
		return input[table][id].to_list()
	except Exception:
		return out[id].to_list()
 
def load():
	"""Load all tables as CSV files. All tables must have a corresponding CSV file with the same name in working dir."""
	input = {}	
	csv_file_path = "table_visualizer.csv"
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
		("ensure_min_max constraints failed on table")
	return True

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


# Fonction pour changer la table affichée dans le tableau
def afficher_donnees(table_name):
    df = tables_dict[table_name]
    
    # Vider l'ancienne vue (si applicable)
    for item in tree.get_children():
        tree.delete(item)

    # Mettre à jour les colonnes
    tree["columns"] = list(df.columns)
    for col in df.columns:
        tree.heading(col, text=col)
        tree.column(col, width=100)

    # Insérer les données
    for index, row in df.iterrows():
        tree.insert("", "end", values=list(row))

# Fonction pour mettre à jour la table affichée lorsque l'utilisateur change de sélection
def on_table_select(event):
    selected_table = table_selector.get()
    afficher_donnees(selected_table)


	
def main():
	input = load()
	out = generate_output(input)
	res_cons = check_constraints(input)
	root = tk.Tk()
	root.title("Visualisation des Données CSV")
	
	## Créer la fenêtre principale
	root = tk.Tk()
	root.title("Changer de Table CSV")
	
	# Ajouter un menu déroulant pour sélectionner une table
	table_selector = ttk.Combobox(root, values=list(tables_dict.keys()))
	table_selector.set(list(tables_dict.keys())