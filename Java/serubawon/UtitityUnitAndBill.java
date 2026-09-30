import java.util.Scanner;
public class UtitityUnitAndBill {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Unit:");
        double numberOfUnit = input.nextDouble();

        double pricePerUnit = 1;

            if (numberOfUnit <= 100)
                pricePerUnit = 50;
            else
            if (numberOfUnit <= 300)
                pricePerUnit = 75;
            else
            if (numberOfUnit > 300)
                pricePerUnit = 100;
        double bill = numberOfUnit * pricePerUnit;
        System.out.printf("The Utility Bill is  %.2f%n",bill);
           

 
}
}
