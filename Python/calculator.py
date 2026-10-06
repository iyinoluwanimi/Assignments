def add_two_number(first_number,second_number):
	return first_number + second_number
	
def subtract_two_number(first_number,second_number):
	if first_number < second_number:
		return second_number - first_number
	else:
		return first_number - second_number

def multiply_two_number(first_number,second_number):
	return first_number * second_number
	
def divide_two_number(first_number,second_number):
	return first_number / second_number
	
def exponential(number,power):
	return number ** power
	
print (add_two_number(5,12))
print (subtract_two_number(15,19))
print (multiply_two_number(3,5))
print (divide_two_number(7,3))
print (exponential(4,3))
