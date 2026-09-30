import java.util.Scanner;
public class StudentScoreScaling {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello Student, Enter your score over 50:");  
        double studentScoreOver50 = input.nextDouble(); 

        
        double studentScoreOver100 =  studentScoreOver50 * 2;
       
        System.out.printf("Your Score over 50 is %.2f%n",studentScoreOver50); 
        System.out.printf("Your Score over 100 is %.2f",studentScoreOver100); 

}
} 
