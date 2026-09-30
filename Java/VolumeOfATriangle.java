import java.util.Scanner;

public class VolumeOfATriangle {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length");
        double length = input.nextDouble();
        double area = (Math.sqrt(3)/4) * length * length;
        doubb volume = area * length;
        System.out.println("the area is" + area);
        System.out.println("the volume is" + volume);




}




}
