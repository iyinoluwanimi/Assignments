import java.util.Scanner;
public class TriangleChecker{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Length of first side");
        double firstSide = input.nextDouble();


        System.out.println("Enter Length of second side");
        double secondSide = input.nextDouble();

        System.out.println("Enter Length of third side");
        double thirdSide = input.nextDouble();



        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("Not a Triangle");
}
    
        else {

        if (firstSide == secondSide && secondSide == thirdSide){
           System.out.println("This is an Equivalent Triangle"); 
}   
        else
        if (firstSide == secondSide || secondSide == thirdSide || thirdSide == firstSide){
            System.out.println("This is an Isosceles Triangle");
}
        else
        if (firstSide != secondSide && secondSide != thirdSide && firstSide != thirdSide) {
            System.out.println("This is an Scalene Triangle");
}
}

}
}
