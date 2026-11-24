fuels = {
    1: ("Petrol", 650),
    2: ("Diesel", 720),
    3: ("Kerosene", 550),
    4: ("Gas", 480),
}

liters_mode = "liters"
amount_mode = "amount"
def is_whole_number(text):
    text = str(text).strip()
    return text.isdecimal()


def get_fuel(input):
    if not is_whole_number(input):
        return None
    number = int(str(input).strip())
    if number in fuels:
        return fuels[number]
    return None

def mode_checker(text):
    text = str(text).strip().lower()
    if text == "liter":
        return liters_mode
    if text == "amount":
        return amount_mode
    return ""

def check_liters(text):
    if not is_whole_number(text):
        return "Liters must be a whole number !!!"
    liters = int(str(text).strip())
    if liters < 1 or liters > 50:
        return "Liters must be between 1 - 50 !!!"
    return ""

def check_amount(text, price_per_liter):
    if not is_whole_number(text):
        return "Amount must be a whole number !!!"
    amount = int(str(text).strip())
    if amount < price_per_liter:
        return "Amount must be above a liter price !!!"
    if calculate_liters(amount, price_per_liter) > 50:
        return "Amount is more than the 50L limit !!!"
    return ""






def main():
    history = []
    while True:
        print("""\nWelcome to {STATION_NAME} !
              1. Buy Petroleum
              2. Show Transaction History"
              3. Exit
              """)

        choice = input("Enter operation: ").strip()

        match (choice):
            case "1" :
            case "2" :
            case "3" :
                print("Goodbye!")
                break
                    
            
        if choice == "1":
            buy_petroleum(history)
        elif choice == "2":
            print("\n" + format_history(history))
        elif choice == "3":
            print("Goodbye!")
            break
        else:
            print("Invalid operation !!!")


if __name__ == "__main__":
    main()