import java.util.Scanner;
public class IntegerVariableSwap {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Integer:");  
        int firstInteger = input.nextInt(); 

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter second Integer:");  
        int secondInteger = input.nextInt();

        System.out.printf("The first integer is %d before sawap%n",firstInteger); 
        System.out.printf("The second integer is %d before swap%n",secondInteger); 

        firstInteger = firstInteger + secondInteger;
        secondInteger = firstInteger - secondInteger;
        firstInteger = firstInteger - secondInteger;

        System.out.printf("The first integer is %d after sawap%n",firstInteger); 
        System.out.printf("The second integer is %d after swap%n",secondInteger); 


}
} 
