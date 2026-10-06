import java.util.Scanner;
public class TicTacToe {

	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		char [][] gameList = new char [3][3];
		
		char number = '1';
		for (int i = 0;i < gameList.length;i++) {
			for (int j = 0;j < gameList[i].length;j++) {
				gameList [i][j] = number;
				number++;
			}
		}
		
		for (int i = 0;i < gameList.length;i++) {
			for (int j = 0;j < gameList[i].length;j++) {
				if (j<2)
					System.out.print(gameList[i][j] + " | ");
				else
					System.out.print(gameList[i][j]);
			}
			if (i < 2) {
				System.out.println();
				System.out.println("---+---+---");
			}
			else
				System.out.println();
		}
		
		for (int i = 0; i < 9;i++) {
			
			if (i % 2 == 0) {
				System.out.print("Player X, select a position (1-9):");
			}
			
			else {
				System.out.print("Player O, select a position (1-9):");				
			}
			int position = input.nextInt();
			int row = (position - 1) / 3;
			int column = (position-1) % 3;
			if (i % 2 == 0) {
				gameList [row][column] = 'X';
			}
			else {
				gameList [row][column] = 'O';
			}
			
			for (int count =0;count < gameList.length;count++) {
				for (int counter=0; counter < gameList[count].length; counter++) {
					if (counter < 2)
						System.out.print(gameList[count][counter] + " | ");
					else
						System.out.print(gameList[count][counter]);
				}
				if (count < 2) {
					System.out.println();
					System.out.println("---+---+---");
				}
				else
					System.out.println();
			}
		}
}


}
