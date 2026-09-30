import java.util.Scanner;
public class TaskOne{
public static void main (String [] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter First Number:");
    double firstNumber = input.nextDouble();

    System.out.println("Enter Second Number:");
    double secondNumber = input.nextDouble();

    System.out.println("Enter Third Number:");
    double thirdNumber = input.nextDouble();

    System.out.println("Enter Fourth Number:");
    double fouthNumber = input.nextDouble();

    System.out.println("Enter Fifth Number:");
    double fifthNumber = input.nextDouble();

    System.out.println("Enter Sixth Number:");
    double sixthNumber = input.nextDouble();

    System.out.println("Enter Seventh Number:");
    double seventhNumber = input.nextDouble();

    System.out.println("Enter Eighth Number:");
    double eighthNumber = input.nextDouble();

    System.out.println("Enter Nineth Number:");
    double ninethNumber = input.nextDouble();

    System.out.println("Enter Tenth Number:");
    double tenthNumber = input.nextDouble();



    double sumOfNumbers = firstNumber + secondNumber + thirdNumber + fouthNumber + fifthNumber + sixthNumber + seventhNumber + eighthNumber + ninethNumber + tenthNumber;


    System.out.printf("The Sum of the Numbers is: %f %n", sumOfNumbers);
}




}
