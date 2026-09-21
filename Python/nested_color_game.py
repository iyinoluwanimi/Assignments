
favorite_color = "blue"
for guesses in range(3):
    guessed_color = input ("Guess the favorite color:").lower()
    if guessed_color == favorite_color:
        print("Correct!")
    elif guessed_color == "green":
        print("Close!")
    else:
        print("Wrong")

