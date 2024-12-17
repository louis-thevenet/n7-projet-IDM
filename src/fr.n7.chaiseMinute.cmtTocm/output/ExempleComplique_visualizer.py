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
	csv_file_path = "table1.csv"
	input["table1"] = pd.read_csv(csv_file_path)
	csv_file_path = "table2.csv"
	input["table2"] = pd.read_csv(csv_file_path)
	return input

def check_constraints(input):
	"""Ensure all contraints are respected in input and output data"""
	################################
	# Verifying Input Constraints
	################################
	### Apply sum ##
	from sum import sum
	res = sum(
		input["table1"]["UN"].to_list(),
		input["table2"]["DEUX"].to_list(),
	)
	### Apply ensure_all_lower_than_3 ##
	from ensure_all_lower_than_3 import ensure_all_lower_than_3
	res = ensure_all_lower_than_3(
		res, # Previous result used in next function
	)
	
	if not res:
		return (False,("ensure_all_lower_than_3 constraints failed"))

	################################
	# Verifying Table Constraints
	################################
	out = generate_output(input)

	return True

def generate_output(input):
	"""Returns a Dict<TableName, Dict<ColumnName, Data>> by applying the the model on the input data."""
	tables = {}
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

	tables["table1"] = out

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
	tables["table2"] = out

	return tables

def save_to_csv(tables):
	"""Saves each table from he input argument as a CSV file."""
	
	################################
	# Saving to "output_table1.csv" 
	################################
	pd.DataFrame.from_dict(tables["table1"], orient="columns").to_csv("output_"+"table1"+".csv", index_label="index")
	
	################################
	# Saving to "output_table2.csv" 
	################################
	pd.DataFrame.from_dict(tables["table2"], orient="columns").to_csv("output_"+"table2"+".csv", index_label="index")



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
	tables_data = load()
	app = TableViewer(tables_data)
	app.mainloop()

	

if __name__ == '__main__':
	main()

