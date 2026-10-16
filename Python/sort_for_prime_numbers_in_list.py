def sort_for_prime_numbers_in_list(numbers):
	sorted_prime_number = []
	
	for number in numbers:
		count = 0
		if number <= 1:
			continue
			
		for list_of_number in range(1,number):
			if number % list_of_number == 0:
				count = count + 1
		if count == 1:
			sorted_prime_number.append(number)
	return sorted_prime_number	
			
print(sort_for_prime_numbers_in_list([5,1,0,9,3,6,2]))

