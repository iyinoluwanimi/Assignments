import java.util.Scanner;
public class MilesToKilometers {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance in Miles:");  
        double distanceInMiles = input.nextDouble(); 

        
        double distanceInKilometres = distanceInMiles * 1.60934;

        System.out.printf("%f Miles is %f Kilometres in distance%n",distanceInMiles,distanceInKilometres); 
}

}
