def move_zeros_in_list_to_the_end(numbers):

	numbers_not_zero = []
	numbers_that_are_zero = []
	
	for number in numbers:
		if number == 0:
			numbers_that_are_zero.append(number)
		else:
			numbers_not_zero.append(number)
	return numbers_not_zero + numbers_that_are_zero
	
print(move_zeros_in_list_to_the_end([5,0,3,0,2,0]))

