import java.util.Scanner;
public class SquareMeterToPing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in Square meters:");
        double squareMeters = input.nextDouble();
        double ping = squareMeters * 0.3025;
        System.out.println("Square Meters is" + squareMeters + "ping is" + ping);
    }
}
