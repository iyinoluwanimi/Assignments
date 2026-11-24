def return_indices_to_get_target_number(numbers,target):
    for index in range(len(numbers)):
        for index2 in range(index+1,len(numbers)):
            indices_list = []
            if numbers[index] +numbers[index2] == target:
                indices_list.append(index)
                indices_list.append(index2)
                print(indices_list)
    return ""
    
print(return_indices_to_get_target_number([2,7,11,15],9))
