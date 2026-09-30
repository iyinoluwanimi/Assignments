import java.util.Scanner;
public class LoginAccessChecker{

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Username:");
        String username = input.next();

        System.out.println("Enter Password:");
        String password = input.next();


            if (username.equalsIgnoreCase("admin") && password.equals("1234"))
                System.out.println("Access granted");
            else
                System.out.println("Access denied");               

 
}
}
