select_letter = input("Enter a letter:").lower()

if select_letter == "a" or select_letter == "e" or select_letter == "i" or select_letter == "o" or select_letter == "u":
    print("Vowel")

elif select_letter == "b" or select_letter == "c" or select_letter == "d" or select_letter == "f" or select_letter == "g" or select_letter == "h" or select_letter == "j" or select_letter == "k" or select_letter == "l" or select_letter == "m" or select_letter == "n" or select_letter == "p" or select_letter == "q" or select_letter == "r" or select_letter == "s" or select_letter == "t" or select_letter == "v" or select_letter == "w" or select_letter == "x" or select_letter == "y" or select_letter == "z":

    print("Consonant")

else:

    print("Invalid Input")
