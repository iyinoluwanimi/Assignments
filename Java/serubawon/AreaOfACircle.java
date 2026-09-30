import java.util.Scanner;
public class AreaOfACircle {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius:");
        double radius = input.nextDouble();


        double pi = 3.14159265359;

        double area = pi * radius * radius;

        System.out.printf("The Area of the Circle is %.2f%n",area);       
    
        

}
}
