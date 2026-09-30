import java.util.Scanner;
public class EvenOrOdd{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer:");
        int integer = input.nextInt();

        if (integer % 2 == 0) 
            System.out.println("Even");
         else           
            System.out.println("Odd");

}
}
