import java.util.Scanner;
public class TheSumOfASeries {

public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter value for n from 1 to 100:");	
	int number = input.nextInt();
	
	long sum = 0;
	for (int index = 1;index <= number;index++) {
		sum = sum + index;
}
	System.out.println(sum);
}
}

