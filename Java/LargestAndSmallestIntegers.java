import java.util.Scanner;
public class LargestAndSmallestIntegers {
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

	Scanner input4 = new Scanner(System.in);
	System.out.println ("Enter Fourth Integer:");
	int fourthInteger = input4.nextInt();

	Scanner input5 = new Scanner(System.in);
	System.out.println ("Enter Fifth Integer:");
	int fifthInteger = input5.nextInt();


	int smallest = firstInteger;
	int largest = firstInteger;


	if (secondInteger < smallest) {
		smallest = secondInteger;

}
	if (thirdInteger < smallest) {
		smallest = thirdInteger;
}
	if (fourthInteger < smallest) {
		smallest = fourthInteger;
}
	if (fifthInteger < smallest) {
		smallest = fifthInteger;
}


	if (secondInteger > largest) {
		largest = secondInteger;

}
	if (thirdInteger > largest) {
		largest = thirdInteger;
}
	if (fourthInteger > largest) {
		largest = fourthInteger;
}
	if (fifthInteger > largest) {
		largest = fifthInteger;
}
	

	System.out.printf ("The Largest is %d %n", largest);
	System.out.printf ("The Smallest is %d %n", smallest);
}

}