import java.util.Scanner;
public class GradeComparison{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Score with 0 to 100:");
        int integer = input.nextInt();


        if (integer >= 0 && integer <= 100){
            if (integer >= 90 && integer <= 100) 
                System.out.println("A");
            else
            if (integer >= 80 && integer <= 89)
               System.out.println("B"); 
            else
            if (integer >= 70 && integer <= 79)
               System.out.println("C"); 
            else
            if (integer >= 60 && integer <= 69)
               System.out.println("D"); 
            else
            if (integer < 60)
               System.out.println("F");             

} 
        else
            System.out.println("Invalid Score");

}
}
