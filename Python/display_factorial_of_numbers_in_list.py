def display_factorial_of_numbers_in_list(numbers):
	factorial_of_number_in_list = []
	for number in numbers:
		factorial = 1
		for index in range (1,number+1):
			factorial  = factorial * index
		factorial_of_number_in_list.append(factorial)
		
	return factorial_of_number_in_list
	
	
print(display_factorial_of_numbers_in_list([1,2,3,4,5,6,7,8,9,10]))
