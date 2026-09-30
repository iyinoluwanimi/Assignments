import java.util.Scanner;
public class DigitInInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000");
        int number = input.nextInt();
        int sum = 0;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        System.out.println("The sum of the Integer is:" + sum);
    }
}
