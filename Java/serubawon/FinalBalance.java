import java.util.Scanner;
public class FinalBalance{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Item Price:");  
        double itemPrice = input.nextDouble(); 

        System.out.println("Enter Item Quantity:");  
        double itemQuantity = input.nextDouble();

        double subtotal = itemPrice * itemQuantity;

        double vat = subtotal * 0.20;

        
        double grandTotal = subtotal + vat;

        System.out.printf("The grand Total price is %f%n",grandTotal); 
}

}
