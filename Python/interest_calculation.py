principal = int(input("How much do you want to invest ?:"))
rate = 7/100
amount_in_ten_years = principal *(1+ rate) ** 10
amount_in_twenty_years = principal* (1+ rate) ** 20
amount_in_thirty_years = principal *(1+ rate) ** 30
print("Amount In 10 years:", amount_in_ten_years)
print("Amount in 20 years:", amount_in_twenty_years)
print("Amount in 30 years:", amount_in_thirty_years)
