import java.util.Scanner;
public class TaskEight{
public static void main (String [] args) {
    int sum = 0;
    Scanner input = new Scanner(System.in);

    for (int index = 1; index <= 10; index++) {

    System.out.println("Enter a Number:");
    int number = input.nextInt();

    if (number % 10 == 0) {
    if (number <= 100) {
        
            sum = sum + number;            

}

}

    
}

  
        System.out.printf("The Sum of the Valid Numbers is: %d %n", sum);
    
}




}
