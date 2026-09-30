import java.util.Scanner;
public class GreaterThanZero{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer:");
        int integer = input.nextInt();

        if (integer > 0) 
            System.out.println("Positive");
        else
        if (integer == 0) 
            System.out.println("Zero");
         else           
            System.out.println("Negative");

}
}
