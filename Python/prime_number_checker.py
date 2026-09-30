user_number = int(input("Enter a Number: "))
count = 0
divisor = 2
if user_number > 1: 
	for number in range(1,user_number):
		if divisor >= 2 and number < user_number:
			if user_number % number == 0:
				count = count + 1
            	
if count == 1:
	print("TRUE")
else:
	print("FALSE")
