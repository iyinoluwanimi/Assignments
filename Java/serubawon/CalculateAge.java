import java.util.Scanner;
public class CalculateAge {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first Name:");  
        String firstName = input.next();  

        System.out.println("Enter your last Name:");  
        String lastName = input.next(); 

        System.out.println("Enter your year of birth:"); 
        int birthYear = input.nextInt();

        int age = 2025 -birthYear;

        System.out.printf("%s %s is born in %d and will be %d years old in 2025%n", firstName,lastName,birthYear,age); 
}

}
