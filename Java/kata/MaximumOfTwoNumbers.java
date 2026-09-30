import java.util.Scanner;
public class MaximumOfTwoNumbers {


	public static void main(String [] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a Number:");
	int firstNumber = input.nextInt();
	
	System.out.println("Enter a Number:");
	int secondNumber = input.nextInt();
	
	System.out.println(MaximumOfTwoNumbers.maximum(firstNumber,secondNumber));
	
	}

	public static double maximum(double firstNumber,double secondNumber) {
		if (firstNumber > secondNumber) {
			return firstNumber;
		}
		else
			return secondNumber;
	}
	public static int maximum(int firstNumber,int secondNumber) {
		if (firstNumber > secondNumber) {
			return firstNumber;
		}
		else
			return secondNumber;
	}
	public static double maximum(int firstNumber,double secondNumber) {
		if (firstNumber > secondNumber) {
			return firstNumber;
		}
		else
			return secondNumber;
	}
	public static double maximum(double firstNumber,int secondNumber) {
		if (firstNumber > secondNumber) {
			return firstNumber;
		}
		else
			return secondNumber;
	}

}
