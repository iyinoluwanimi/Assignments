import java.util.Scanner;
public class Multiples {

	public static void main (String []args) {

	Scanner input1 = new Scanner(System.in);
	System.out.println("Enter First Integer:");
	int firstInteger = input1.nextInt();
	
	Scanner input2 = new Scanner(System.in);
	System.out.println("Enter Second Integer:");
	int secondInteger = input2.nextInt();


	int firstIntegerTripled = firstInteger * firstInteger * firstInteger;
	int secondIntegerDoubled = secondInteger * secondInteger;

	if (firstIntegerTripled % secondIntegerDoubled == 0) {
	System.out.println ("The First Integer tripled is a multiple of the Second Integer Doubled");

}

	else {
	System.out.println ("The First Integer tripled is not a multiple of the Second Integer Doubled");	
}

	System.out.printf ("The First Integer tripled divided by the Second Integer Doubled is %d %n", firstIntegerTripled/secondIntegerDoubled); 
	
}

}