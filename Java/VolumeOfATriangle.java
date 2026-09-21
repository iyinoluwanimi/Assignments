import java.util.Scanner;

public class VolumeOfATriangle {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the sides and height of the equilateral triangle:");
        double length = input.nextDouble(); 

        double area = (((Math.sqrt(3))/4) * (length * length)) ;


        double volume = area * length;

        System.out.printf("The area is %f", area);
        System.out.printf("The volume of the Triangular prism is %f", volume);




}




}
