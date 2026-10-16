def display_list_of_perfect_square(numbers):
	list_of_perfect_square = []
	for number in numbers:
		square_root_of_number = number ** (1/2)
		if number // square_root_of_number == square_root_of_number:
			list_of_perfect_square.append(number)	
	return list_of_perfect_square
	
	
print(display_list_of_perfect_square([1,2,3,4,5,6,7,8,9,12,16,25]))
	
