import java.util.Scanner;
public class DivisibleBy3 {

	public static void main (String []args) {

	Scanner input = new Scanner (System.in);
	System.out.println("Enter an Integer:");
	int integer = input.nextInt();
	
	if (integer % 3 == 0) {
	System.out.println ("Integer is divisible by 3");
}
	else {
	System.out.println ("Integer is not divisible by 3");
}
}

}