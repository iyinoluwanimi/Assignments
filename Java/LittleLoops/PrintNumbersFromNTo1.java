import java.util.Scanner;
public class PrintNumbersFromNTo1 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive Number:");
		int number = input.nextInt();
		
		int index = number;

		while (index >= 1) {
		System.out.println(index);
		index--;
		}
		
		
	}

}
