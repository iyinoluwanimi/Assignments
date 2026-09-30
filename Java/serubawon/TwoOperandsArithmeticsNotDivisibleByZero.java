import java.util.Scanner;
public class TwoOperandsArithmeticsNotDivisibleByZero {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number:");
        double firstNumber = input.nextDouble();

        System.out.println("Enter Second Number:");
        double secondNumber = input.nextDouble();

        if (secondNumber == 0)
            System.out.println("Not Divisible By Zero");
        else{
            double sum_of_numbers = firstNumber + secondNumber;
            double difference_in_numbers = firstNumber - secondNumber;
            double product_of_numbers = firstNumber * secondNumber;
            double quotient_of_numbers = firstNumber / secondNumber;

        
            System.out.printf("%f + %f is %f%n", firstNumber, secondNumber, sum_of_numbers);
            System.out.printf("%f - %f is %f%n", firstNumber, secondNumber, difference_in_numbers);
            System.out.printf("%f * %f is %f%n", firstNumber, secondNumber, difference_in_numbers);
            System.out.printf("%f / %f is %f%n", firstNumber, secondNumber, quotient_of_numbers);


}

        
}

}
