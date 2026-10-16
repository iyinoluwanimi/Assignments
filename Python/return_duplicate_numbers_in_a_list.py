def return_duplicate_numbers_in_a_list(numbers):

	duplicate_numbers = []
	
	for index1 in range(len(numbers)):
		count = 0
	
		for index2 in range(index1 +1,len(numbers)):
			if numbers[index1] == numbers[index2]:
				count = count + 1
					
		if count == 1 :
			duplicate_numbers.append(numbers[index1])
			
	return duplicate_numbers
	
	
print(return_duplicate_numbers_in_a_list([45,60,3,0,67,2,45,3,22,0]))

