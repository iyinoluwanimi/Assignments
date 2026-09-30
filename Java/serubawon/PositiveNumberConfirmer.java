import java.util.Scanner;
public class PositiveNumberConfirmer {
public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
		int number;
	do {
		System.out.println("Enter a Number:");
		number = input.nextInt();
	}while (number <= 0);


    
}



}
