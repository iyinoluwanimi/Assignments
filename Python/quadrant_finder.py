first_integer = int(input("Enter first Integer:"))
second_integer = int(input("Enter second Integer:"))

if first_integer > 0 and second_integer > 0:
    print("Q1")
elif first_integer < 0 and second_integer > 0:
    print("Q2")
elif first_integer < 0 and second_integer < 0:
    print("Q3")
elif first_integer > 0 and second_integer < 0:
    print("Q1")
elif first_integer == 0 and second_integer == 0:
    print("Origin")
elif second_integer == 0 and first_integer != 0:
    print("X-axis")
elif first_integer == 0 and second_integer != 0:
    print("Y-axis")
