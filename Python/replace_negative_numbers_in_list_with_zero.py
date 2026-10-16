def replace_negative_numbers_in_list_with_zero(numbers):
	for number in range(len(numbers)):
		if numbers[number] < 0:
			numbers[number] = 0
	return numbers
	
print(replace_negative_numbers_in_list_with_zero([5,-9,3,-6,2,-11]))

