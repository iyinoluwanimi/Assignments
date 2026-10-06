print("Multiplication Table")
print("    ",end = "")
for number1 in range(1,11):
	print (number1,end = " ")
print()
for number in range(1,12):
	print ("-",sep = "",end = "")
print()
for number10 in range(1,10):
	print(f"{number10} |  {number10} {number10*2} {number10*3} {number10*4} {number10*5} {number10*6} {number10*7} {number10*8} {number10*9}")

