
def get_card_type(card_number):
    if card_number.startswith("37"):
        return "American Express"
    elif card_number.startswith("4"):
        return "Visa"
    elif card_number.startswith("5"):
        return "MasterCard"
    elif card_number.startswith("6"):
        return "Discover"
    else:
        return "Unknown"


def is_valid_card(card_number):
    if not card_number.isdigit():
        return False

    if len(card_number) < 13 or len(card_number) > 16:
        return False

    total = 0
    double_digit = False

    for digit in reversed(card_number):
        number = int(digit)

        if double_digit:
            number = number * 2

            if number > 9:
                number = number - 9

        total = total + number
        double_digit = not double_digit

    return total % 10 == 0

