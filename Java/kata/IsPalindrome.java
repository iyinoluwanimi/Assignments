public class IsPalindrome { 
    

    public static boolean isPalindrome(int number) { 
    	int firstDigit = number / 10000;
    	int secondDigit = number / 1000 % 10;
    	int thirdDigit = number / 100 % 10;
    	int fourthDigit = number / 10 % 10;
    	int fifthDigit = number % 10;
    	
    	if (firstDigit == fifthDigit && secondDigit == fourthDigit)
    		return true;
    	else
    		return false;
	
    } 

    public static void main (String... args) { 
        System.out.println(isPalindrome(54145));
    } 
}

