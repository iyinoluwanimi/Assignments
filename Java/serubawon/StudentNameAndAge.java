import java.util.Scanner;
public class StudentNameAndAge {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello Student, Enter your Name:");  
        String studentName = input.nextLine();  

        System.out.println("Hello Student, Enter your Age:"); 
        int studentAge = input.nextInt();

        System.out.printf("Hello, %s. You are %d years old%n", studentName,studentAge); 

}

}
