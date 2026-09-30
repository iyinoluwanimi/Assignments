import java.util.Scanner;
public class CelsiusToFahreneit {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a temperature in Celsius:");
        double temperatureInCelsius = input.nextDouble();


        double temperatureInFahreneit = (temperatureInCelsius * 9/5) + 32;
    
        System.out.printf("%f Degrees in Celsius is %f Degrees in Fahreneit", temperatureInCelsius, temperatureInFahreneit);
}

}
