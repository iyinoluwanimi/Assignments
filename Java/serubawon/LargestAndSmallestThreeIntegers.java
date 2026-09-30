import java.util.Scanner;
public class LargestAndSmallestThreeIntegers {
	public static void main (String []args) {

	Scanner input1 = new Scanner(System.in);
	System.out.println ("Enter First Integer:");
	int firstInteger = input1.nextInt();

	Scanner input2 = new Scanner(System.in);
	System.out.println ("Enter Second Integer:");
	int secondInteger = input2.nextInt();

	Scanner input3 = new Scanner(System.in);
	System.out.println ("Enter Third Integer:");
	int thirdInteger = input3.nextInt();


	int smallest = firstInteger;
	int largest = firstInteger;


	if (secondInteger < smallest) {
		smallest = secondInteger;

}
	if (thirdInteger < smallest) {
		smallest = thirdInteger;
}

	if (secondInteger > largest) {
		largest = secondInteger;

}
	if (thirdInteger > largest) {
		largest = thirdInteger;
}
	

	System.out.printf ("The Largest is %d %n", largest);
	System.out.printf ("The Smallest is %d %n", smallest);
}

}
