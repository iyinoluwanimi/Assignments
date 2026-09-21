first_integer = int(input (" Enter First Integer:"))
second_integer = int(input (" Enter Second Integer:"))
third_integer = int(input (" Enter Third Integer:"))

largest_integer = first_integer

if second_integer > largest_integer:
    largest_integer = second_integer

if third_integer > largest_integer:
    largest_integer = third_integer

print ("Largest number:", largest_integer)
