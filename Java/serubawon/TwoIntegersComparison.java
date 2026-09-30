import java.util.Scanner;
public class TwoIntegersComparison{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Integer:");
        int firstInteger = input.nextInt();

        System.out.println("Enter second Integer:");
        int secondInteger = input.nextInt();

        int largest = firstInteger;
        int smallest = firstInteger;

            if (secondInteger < smallest)
                smallest = secondInteger;
            System.out.printf("The Smallest number is %d%n",smallest);

            if (secondInteger > largest)
                largest = secondInteger;
            System.out.printf("The largest number is %d%n",largest);

            if (secondInteger == firstInteger) { 
                largest = secondInteger;
                System.out.printf("The first Integer is %d is same as the second Integer %d ",firstInteger, secondInteger);
}
           

 
}
}
