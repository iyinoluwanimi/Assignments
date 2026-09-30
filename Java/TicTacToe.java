import java.util.Scanner;

public class TicTacToe {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        String gameList [][] = new String[3][3];


        // Put numbers 1 - 9 into the board
        int number = 1;

        for (int i = 0; i < gameList.length; i++) {

            for (int index = 0; index < gameList[i].length; index++) {
                gameList[i][index] = String.valueOf(number);
                number++;
            }
        }


        // Display the board
        for (int count = 0; count < gameList.length; count++) {

            for (int counter = 0; counter < gameList[count].length; counter++) {
                System.out.print(gameList[count][counter]);

                if (counter < 2)
                    System.out.print(" | ");
            }

            System.out.println();

            if (count < 2)
                System.out.println("---+---+---");
        }


        // Allow 9 players' moves
        for (int turn = 0; turn < 9; turn++) {

            System.out.println();

            if (turn % 2 == 0)
                System.out.println("Player X, select a position (1-9):");
            else
                System.out.println("Player O, select a position (1-9):");

            int position = input.nextInt();

            int row = (position - 1) / 3;
            int column = (position - 1) % 3;


            if (turn % 2 == 0)
                gameList[row][column] = "X";
            else
                gameList[row][column] = "O";


            // Display the updated board
            for (int count = 0; count < gameList.length; count++) {

                for (int counter = 0; counter < gameList[count].length; counter++) {
                    System.out.print(gameList[count][counter]);

                    if (counter < 2)
                        System.out.print(" | ");
                }

                System.out.println();

                if (count < 2)
                    System.out.println("---+---+---");
            }
        }
    }
}
```

