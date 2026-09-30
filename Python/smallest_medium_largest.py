first_float = float(input("Enter Decimal Number:"))
second_float = float(input("Enter Decimal Number:"))
third_float = float(input("Enter Decimal Number:"))
smallest = first_float
medium = second_float
largest = third_float
if second_float <= smallest and second_float <= third_float:
    second_float = smallest
elif third_float <= smallest and third_float <= second_float:
    third_float = smallest
if first_float <= smallest and first_float >= third_float:
    first_float = medium
elif third_float <= smallest and third_float >= first_float:
    third_float = medium
if first_float >= largest and first_float <= second_float:
    first_float = largest
elif second_float >= largest and second_float >= first_float:
    second_float = largest
print(smallest)
print(medium)
print(largest)
