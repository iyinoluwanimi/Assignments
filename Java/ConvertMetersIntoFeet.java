import java.util.Scanner;

public class ConvertMetersIntoFeet {

    public static void main(String [] main) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value in meter:");
        double meter = input.nextDouble();
        double feet = meter * 3.2786;
        System.out.println(meter + "meters in feet is" + feet);


}

}
