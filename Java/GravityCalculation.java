import java.util.Scanner;
public class GravityCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal rate:");
        double subtotal = input.nextDouble();
        System.out.print("Enter the gravity rate:");
        double gravityRate = input.nextDouble();
        double gravity = subtotal * gravityRate / 100;
        double total = subtotal + gravity;

        System.out.println("The gravity is $" + gravity + "and total is $" + total);
    }
}
