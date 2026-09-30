public class CombinationOfTwoNumbers {


public static void main (String... args) {

	System.out.println(combination(5,3));

}

public static int combination(int firstNumber,int secondNumber) {
	 
	int combination = factorial(firstNumber) /(factorial(firstNumber-secondNumber) *factorial(secondNumber));
	return combination;


} 

public static int factorial(int number) {

	int product = 1;
	for (int i = 1;i <= number;i++) {
	product = product * i;
	
	}
	return product;

} 

}


