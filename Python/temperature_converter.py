for celsius in range(5):
    celsius = float(input("Enter your temperature in celsius:"))
    fahrenheit = float((celsius * 9/5) + 32)
    if celsius < -273:
        print("impossible!")
    else:
        print(fahrenheit)


