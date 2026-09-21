import java.util.Scanner;
public class DiameterCircumferenceAndAreaOfACircle {
	public static void main(String []args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Radius:");
	float radius = input.nextFloat();
	
	double diameter = 2 * radius;
	double circumference = 2 * 3.14159 * radius;
	double area = 3.14159 * radius * radius;


	System.out.printf("The Diameter is %f,%nThe circumference is %f,%nAnd The area of the circle is %f",diameter, circumference, area);





}



}