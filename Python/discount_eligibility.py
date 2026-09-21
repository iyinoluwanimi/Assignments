total_bill = int(input("Enter your total bill:"))
is_member = input("Are you a member? 'yes' or 'no':")

if total_bill >= 1000 and is_member == "yes":
    print("Your final amount:",total_bill + total_bill*0.1)
    print("10% off")
elif total_bill >= 1000 and is_member == "no":
    print("Your final amount:",total_bill + total_bill*0.05)
    print("5% off")
else:
    print("Your final amount:",total_bill)
    print("No discount")
