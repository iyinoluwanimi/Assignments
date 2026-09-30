import java.util.Scanner;
public class PrintNumbersFrom1ToN {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive Number:");
		int number = input.nextInt();
		
		int index = 1;

		while (index <= number) {
		System.out.println(index);
		index++;
		}
		
	
	}

}
