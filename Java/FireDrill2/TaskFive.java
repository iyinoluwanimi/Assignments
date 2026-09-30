import java.util.Scanner;
public class TaskFive{
public static void main (String [] args) {
    
    Scanner input = new Scanner(System.in);
    double sum = 0;
    for (double index = 1; index <= 10; index++) {

    System.out.println("Enter a Number:");
    double number = input.nextDouble();

    
    if (number % 2 == 0) {
    sum = sum + number;

}
    System.out.printf("The Sum of the Even Numbers is: %f %n", sum);
}
    
    

    
}




}
