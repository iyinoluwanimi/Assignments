import java.util.Scanner;
public class SumOfNumbersNotEqualZero {
public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
		int number;
		int sum = 0;
	do {
		System.out.println("Enter a Number:");
		number = input.nextInt();
		sum = sum + number;
	}while (number != 0);

    System.out.printf("The sum of Numbers is %d:",sum);

    
}



}
