import java.util.Scanner;
public class AgeRange{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Age range:");
        int integer = input.nextInt();

            if (integer < 13) 
                System.out.println("Child");
            else
            if (integer >= 17 && integer <= 13)
               System.out.println("Teenager"); 
            else
            if (integer >= 18 && integer <= 64)
               System.out.println("Adult"); 
            else
            if (integer > 65)
               System.out.println("Senior");             


}
}
