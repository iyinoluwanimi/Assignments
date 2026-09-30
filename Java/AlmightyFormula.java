import java.util.Scanner;
public class AlmightyFormula {
	public static void main (String []args) {

	Scanner input = new Scanner(System.in);

	System.out.println ("Enter a decimal number for a:");
	double valueForA = input.nextDouble();

	System.out.println ("Enter a decimal number for b:");
	double valueForB = input.nextDouble();

	System.out.println ("Enter a decimal number for c:");
	double valueForC = input.nextDouble();

    double valueForX1 = (-valueForB + Math.sqrt((valueForB * valueForB)- 4 * valueForA * valueForC)) / (2 * valueForA);
    double valueForX2 = (-valueForB - Math.sqrt((valueForB * valueForB)- 4 * valueForA * valueForC)) / (2 * valueForA);


	System.out.printf ("The first value for X is %f%n", valueForX1);
	System.out.printf ("The second value for X is %f%n", valueForX2);
}

}
