import java.util.Scanner;
public class XandOGame {

	public static void main(String... args) {
	
		Scanner input = new Scanner(System.in);
	
		String gameList [][] = new String[3][3];
		
		
		for (int i = 0; i < gameList.length; i++) {

			for (int index = 0; index < gameList[i].length; index++) {
				System.out.println("Enter either 'X' or 'O':");
				String userInput = input.next();
				gameList[i][index] = userInput;
			}

			
		}
		int count = 0;
		int counter = 0;
		for (count = 0; count < gameList.length; count++) {
			for (counter = 0; counter < gameList[count].length; counter++) {
				System.out.print(gameList[count][counter]);		
			}
			
			System.out.println();
		}
	}
	

}

