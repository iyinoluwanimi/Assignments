buyer_name = input("Enter your Name:\n")

loop_number = 0

total = 0
while loop_number < 1:
    product_name = input("Enter Product Name:\n")
    product_quantity = float(input(f'Enter quantity of {product_name}:\n'))    
    product_price = float(input(f'Enter Price of {product_name}:\n'))
    list_continuation = input("Add another product,'yes' or 'no'\n").lower()
    bill =  product_quantity * product_price  
    
    total = total + bill
    if list_continuation == "no":
        loop_number += 1
        print(f'Your total Bill is {total}')

      
    
