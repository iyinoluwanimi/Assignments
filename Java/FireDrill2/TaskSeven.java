import java.util.Scanner;
public class TaskSeven{
public static void main (String [] args) {
    
    Scanner input = new Scanner(System.in);
    double sum = 0;
    double averageNumber = 0;
    for (double index = 1; index <= 10; index++) {

    System.out.println("Enter a Number:");
    double number = input.nextDouble();

    
    if (number % 2 == 0) {
    sum = sum + number;
    averageNumber++;

}

    
}
    
    double average = sum / averageNumber;
    System.out.printf("The Sum of the Even Numbers is: %f %n", sum);
    System.out.printf("The Average of the Even Numbers is: %f %n", average);
  

    
}




}
