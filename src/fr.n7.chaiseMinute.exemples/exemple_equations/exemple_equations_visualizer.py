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
	### Apply ensure_is_not_null ##
	from ensure_is_not_null import ensure_is_not_null
	res = ensure_is_not_null(
		input["table"]["a"].to_list(),
	)

		

	if not res:
		return (False,("ensure_is_not_null constraints failed"))

	################################
	# Verifying Table Constraints
	################################
	out = generate_output(input)

	### Verify data types
	for x in out["equations"]["Solution"]:
		break

	for x in out["equations"]["delta"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on equations.delta")


	for x in out["equations"]["a"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on equations.a")


	for x in out["equations"]["b"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on equations.b")


	for x in out["equations"]["c"]:
		if (type(x)!=int and type(x)!=numpy.int64):
			return (False, "Type constraints failed on equations.c")



	return (True, "Constraints are respected")

def generate_output(input):
	"""Returns a Dict<TableName, Dict<ColumnName, Data>> by applying the the model on the input data."""
	tables = {}
	out = {}
	###########################################################################
	# Table: equations
	###########################################################################
	### Imported column: a from table.a ###
	out["a"]=input["table"]["a"]

	### Imported column: b from table.b ###
	out["b"]=input["table"]["b"]

	### Imported column: c from table.c ###
	out["c"]=input["table"]["c"]

	################################			
	## Computed column: Solution 
	################################
	### Apply compute_delta ##
	from compute_delta import compute_delta
	out["Solution"] = compute_delta(
		search(input, out, "equations", "a"),
		search(input, out, "equations", "b"),
		search(input, out, "equations", "c"),
	)
	###############
	### Apply solve ##
	from solve import solve
	out["Solution"] = solve(
		out["Solution"], # Previous result used in next function
		search(input, out, "equations", "a"),
		search(input, out, "equations", "b"),
		search(input, out, "equations", "c"),
	)
	###############
	################################			
	## Computed column: delta 
	################################
	### Apply compute_delta ##
	from compute_delta import compute_delta
	out["delta"] = compute_delta(
		search(input, out, "equations", "a"),
		search(input, out, "equations", "b"),
		search(input, out, "equations", "c"),
	)
	###############
	tables["equations"] = out

	return tables

def save_to_csv(tables):
	"""Saves each table from he input argument as a CSV file."""
	
	################################
	# Saving to "output_equations.csv" 
	################################
	pd.DataFrame.from_dict(tables["equations"], orient="columns").to_csv("output_"+"equations"+".csv", index_label="Index")



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

