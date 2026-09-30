import java.util.Scanner;

public class CheckForDaysInMonth {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number for the month e.g April is 4:");
        String month = input.next();

        switch (month) {
            case "1" -> System.out.println("January has 31 Days");
            case "2" -> 
            	{System.out.println("Enter the year");	
            	int year = input.nextInt();
            	
            	if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            		System.out.printf("%d is a leap year so February has 29 days", year);
        		
        		else
        		    System.out.printf("%d is not a leap year so February has 28 days", year);

            	}
            case "3" -> System.out.println("March has 31 Days");
            case "4" -> System.out.println("April has 30 Days");
            case "5" -> System.out.println("May has 31 Days");
            case "6" -> System.out.println("June has 30 Days");
            case "7" -> System.out.println("July has 31 Days");
            case "8" -> System.out.println("August has 31 Days");
            case "9" -> System.out.println("September has 30 Days");
            case "10" -> System.out.println("October has 31 Days");
            case "11" -> System.out.println("November has 30 Days");
            case "12" -> System.out.println("December has 31 Days");


}

        
    }
}
