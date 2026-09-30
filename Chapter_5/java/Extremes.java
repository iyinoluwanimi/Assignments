import java.util.Scanner;
public class Extremes{
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to Input:");
		int numberOfInput = input.nextInt();
		
		System.out.println("Enter a Number:");
		int number = input.nextInt();			
		int maximum = number;
		int minimum = number;
		
		for (int index = 2; index <= numberOfInput; index++) {
		
			System.out.println("Enter a Number:");
			int otherNumbers = input.nextInt();
			

			
			
			if (maximum < otherNumbers) {
				maximum = otherNumbers;
			}
			if (minimum > otherNumbers){
				minimum = otherNumbers;
			}			
		}
		
		
		int sum = maximum + minimum; 
		System.out.printf("The minimum is: %d%n",minimum);
		System.out.printf("The maximum is: %d%n",maximum);
		System.out.printf("The sum is: %d%n",sum);
		
	
	
	}
}
