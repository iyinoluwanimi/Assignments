import java.util.Scanner;
public class SeparatingTheDigitsInAnInteger {
	public static void main (String [] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Five Digit number:");
	int fiveDigitInteger = input.nextInt();

	int digit1 = fiveDigitInteger / 10000;
	int digit2 = (fiveDigitInteger / 1000) % 10;
	int digit3 = (fiveDigitInteger /  100) % 10;
	int digit4 = (fiveDigitInteger / 10) % 10;
	int digit5 = fiveDigitInteger % 10;
	

	System.out.printf("%d %d %d %d %d", digit1, digit2, digit3, digit4, digit5);
}

}