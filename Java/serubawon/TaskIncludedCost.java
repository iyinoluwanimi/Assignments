import java.util.Scanner;
public class TaskIncludedCost {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of what you are buying:");
        double price = input.nextDouble();


        double tax = price * 0.075;
        double totalCost = price + tax;
    
        System.out.printf("The total Cost including tax is %f", totalCost);
}

}
