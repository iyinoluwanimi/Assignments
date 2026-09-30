import java.util.Scanner;

public class DivisibilityBy3And5 {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer:");
        int integer = input.nextInt();

        if (integer % 3 == 0 && integer % 5 == 0)
            System.out.println("Divisible by 3 and 5");
        else
        if (integer % 3 == 0 && integer % 5 != 0)
           System.out.println("Divisible by 3");
        else
        if (integer % 3 != 0 && integer % 5 == 0)
            System.out.println("Divisible by 5");
        else System.out.println("Not divisible by 3 and 5");


    }
}
