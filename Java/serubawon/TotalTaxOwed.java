import java.util.Scanner;
public class TotalTaxOwed{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how much you make:");
        double income = input.nextDouble();

        double tax = 0;

        if (income <= 300000)
            tax = 0;
        else
        if (income <= 600000)
           tax = 0.07;
        else
        if (income > 600000)
            tax = 0.15;

        double totalTax = income * tax;
        System.out.printf("your total tax owed is  %f%n",totalTax);
           

 
}
}
