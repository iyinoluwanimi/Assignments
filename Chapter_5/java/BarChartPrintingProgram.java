import java.util.Scanner;
public class BarChartPrintingProgram{
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter a number:");
		int secondNumber = input.nextInt();
		
		System.out.println("Enter a number:");
		int thirdNumber = input.nextInt();
		
		System.out.println("Enter a number:");
		int fourthNumber = input.nextInt();
		
		System.out.println("Enter a number:");
		int fifthNumber = input.nextInt();		
			
			
			
			
		if (firstNumber <= 30 && fifthNumber >=1) {
			for (int a = 1; a <= firstNumber; a++) {
				
				System.out.print("*");
				
				}
			
			}
			
		System.out.println();
		if (secondNumber <= 30 && secondNumber >=1) {
				for (int b = 1; b <= secondNumber; b++) {
				
					System.out.print("*");
				
				}
			
			}
			
		System.out.println();
		
		if (thirdNumber <= 30 && thirdNumber >=1) {
				for (int c = 1; c <= thirdNumber; c++) {
				
					System.out.print("*");
				
				}
			
			}
			
		System.out.println();
		
		if (fourthNumber <= 30 && fourthNumber >=1) {
				for (int d = 1; d <= fourthNumber; d++) {
				
					System.out.print("*");
				
				}
			
			}
			
		System.out.println();
		
		if (fifthNumber <= 30 && fifthNumber >=1) {
				for (int e = 1; e <= fifthNumber; e++) {
				
					System.out.print("*");
				
				}
			
			}
			
		System.out.println();
		
		}
	
	
	}

