import java.util.Scanner;
public class ModifiedCompoundInterestProgram {

public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the amount:");	
	double amount = input.nextDouble();
	double interest;
	
	for (double index = 5;index <= 10;index++) {
		interest = index/100 * amount;
		System.out.printf("%.2f percent of %.2f is %.2f%n", index,amount,interest);
}
}
}

