import sys
import numpy
import pandas as pd
import tkinter as tk
from tkinter import ttk, filedialog

def search(input, out, table, id):
	try:
		return input[table][id].to_list()
	except Exception:
		return out[id].to_list()
 
def load(files):
	"""Load all tables as CSV files. All tables must have a corresponding CSV file with the same name in working dir."""
	input = {}	
	for filename in files:
		name = filename.rsplit(".",1)[0]
		input[name] = pd.read_csv(filename)

	return input

def check_constraints(input):
	"""Ensure all contraints are respected in input and output data"""
	################################
	# Verifying Input Constraints
	################################
	### Apply ensure_min_max ##
	from ensure_min_max import ensure_min_max
	res = ensure_min_max(
		input["table"]["Low"].to_list(),
		input["table"]["High"].to_list(),
	)

		

	if not res:
		return (False,("ensure_min_max constraints failed"))

	################################
	# Verifying Table Constraints
	################################
	out = generate_output(input)

	### Verify data types
	for x in out["table"]["Open"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table.Open")
	
	for x in out["table"]["High"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table.High")
	
	for x in out["table"]["Low"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table.Low")
	
	for x in out["table"]["Close"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table.Close")
	
	for x in out["table"]["Adj_Close"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table.Adj_Close")
	
	for x in out["table"]["Volume"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on table.Volume")


	### Verify data types
	for x in out["table2"]["Ouverture"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Ouverture")
	
	for x in out["table2"]["Min"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Min")
	
	for x in out["table2"]["Max"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Max")
	
	for x in out["table2"]["Fermeture"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Fermeture")
	
	for x in out["table2"]["Volume"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on table2.Volume")

	for x in out["table2"]["Moyenne"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Moyenne")
	
	for x in out["table2"]["Variation"]:
		if (type(x)!=float and type(x)!=numpy.float64):
			return (False, "Type constraints failed on table2.Variation")
	

	return (True, "Constraints are respected")

def generate_output(input):
	"""Returns a Dict<TableName, Dict<ColumnName, Data>> by applying the the model on the input data."""
	tables = {}
	out = {}
	###########################################################################
	# Table: table
	###########################################################################
	################################
	## Data column: Open 
	################################
	out["Open"]=input["table"]["Open"]

	################################
	## Data column: High 
	################################
	out["High"]=input["table"]["High"]

	################################
	## Data column: Low 
	################################
	out["Low"]=input["table"]["Low"]

	################################
	## Data column: Close 
	################################
	out["Close"]=input["table"]["Close"]

	################################
	## Data column: Adj_Close 
	################################
	out["Adj_Close"]=input["table"]["Adj_Close"]

	################################
	## Data column: Volume 
	################################
	out["Volume"]=input["table"]["Volume"]

	tables["table"] = out

	out = {}
	###########################################################################
	# Table: table2
	###########################################################################
	### Imported column: Ouverture from table.Open ###
	out["Ouverture"]=input["table"]["Open"]

	### Imported column: Min from table.Low ###
	out["Min"]=input["table"]["Low"]

	### Imported column: Max from table.High ###
	out["Max"]=input["table"]["High"]

	### Imported column: Fermeture from table.Close ###
	out["Fermeture"]=input["table"]["Close"]

	### Imported column: Volume from table.Volume ###
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
	tables["table2"] = out

	return tables

def save_to_csv(tables):
	"""Saves each table from he input argument as a CSV file."""
	
	################################
	# Saving to "output_table.csv" 
	################################
	pd.DataFrame.from_dict(tables["table"], orient="columns").to_csv("output_"+"table"+".csv", index_label="Date")
	
	################################
	# Saving to "output_table2.csv" 
	################################
	pd.DataFrame.from_dict(tables["table2"], orient="columns").to_csv("output_"+"table2"+".csv", index_label="Date")



class TableViewer(tk.Tk):
    def __init__(self, tables):
        super().__init__()

        self.title("Table Viewer")
        self.geometry("1500x800")

        self.tables = tables
        self.current_table = None

        self.left_frame = tk.Frame(self)
        self.left_frame.grid(row=0, column=0, padx=10, pady=10, sticky="nswe")

        self.table_listbox = tk.Listbox(self.left_frame, height=20)
        self.table_listbox.pack(fill=tk.Y, padx=10)
        self.table_listbox.bind("<<ListboxSelect>>", self.on_table_select)

        self.populate_table_list()

        self.right_frame = tk.Frame(self)
        self.right_frame.grid(row=0, column=1, padx=10, pady=10, sticky="nswe")

        self.treeview = ttk.Treeview(self.right_frame)
        self.treeview.pack(fill=tk.BOTH, expand=True, padx=10, pady=10)

        self.grid_columnconfigure(0, weight=1, uniform="equal")
        self.grid_columnconfigure(1, weight=3, uniform="equal")

    def populate_table_list(self):
        """Populate the listbox with the table names."""
        for table_name in self.tables:
            self.table_listbox.insert(tk.END, table_name)

    def on_table_select(self, event):
        """Handle table selection from the listbox."""
        selected_index = self.table_listbox.curselection()
        if not selected_index:
            return

        table_name = self.table_listbox.get(selected_index)
        self.display_table(table_name)

    def display_table(self, table_name):
        """Display selected table in the Treeview."""
        table = self.tables[table_name]

        for item in self.treeview.get_children():
            self.treeview.delete(item)

        columns = list(table.keys())
        self.treeview["columns"] = columns
        self.treeview["show"] = "headings"

        num_rows = 0
        for col in columns:
            self.treeview.heading(col, text=col)
            if num_rows < len(table[col]):
                num_rows = len(table[col])

        for i in range(num_rows):
            row = [table[col][i] for col in columns]
            self.treeview.insert("", tk.END, values=row)



def main():
	tables_data = load(sys.argv[1:])
	res, msg = check_constraints(tables_data)
	if not res:
		print(msg)
		return 
	
	tables_data = generate_output(tables_data)
	app = TableViewer(tables_data)
	app.mainloop()

if __name__ == '__main__':
	main()

