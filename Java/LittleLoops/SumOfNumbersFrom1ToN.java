import java.util.Scanner;
public class SumOfNumbersFrom1ToN {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive Number:");
		int number = input.nextInt();
		
		int index = 1;
		int sum = 0;

		while (index <= number) {
		sum = sum + index;
		index++;
		}
		
		System.out.println(sum);
	}

}
