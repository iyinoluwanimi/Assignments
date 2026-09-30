five_digit_Integer = int(input("Enter a five digit Integer:"))
digit1 = five_digit_Integer // 10000
digit2 = (five_digit_Integer // 1000) % 10
digit3 = (five_digit_Integer // 100) % 10
digit4 = (five_digit_Integer // 10) % 10
digit5 = five_digit_Integer % 10

print(digit1, digit2, digit3, digit4, digit5,
sep = "    ")
