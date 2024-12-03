import sys

def main():
	filename = sys.argv[1]
	print(filename)
	f = open(filename, "r")
	print(f.read()) 
	
if __name__ == '__main__':
	main()
