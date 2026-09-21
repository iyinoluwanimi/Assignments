player1_input = input("Player 1, Enter your Input, 'rock','scissors','paper':").lower()
player2_input = input("Player 2, Enter your Input, 'rock','scissors','paper':").lower()

if player1_input == player2_input:
    print ("Tie")

else:
    if player1_input == "rock":
        if player2_input == "scissors":
            print("Player 1 wins")
        else: 
            print("Player 2 wins")


    elif player1_input == "paper":
        if player2_input == "rock":
            print("Player 1 wins")
        else: 
            print("Player 2 wins")
    elif player1_input == "scissors":
        if player2_input == "paper":
            print("Player 1 wins")
        else: 
            print("Player 2 wins")


