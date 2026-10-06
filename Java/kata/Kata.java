public class Kata {

	public static boolean isEven(int number){
		if (number % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static boolean isPrime(int number){
		int count = 0;
		for (int index = 1; index <= number; index++)
		if (number % index == 0)
			count++;
		if (count == 2)
			return true;
		else
			return false;
	}
	
	public static int subtract(int firstNumber,int secondNumber) {
	if (firstNumber < secondNumber){
		return secondNumber - firstNumber;
	}
	else
		return firstNumber - secondNumber;
	}

	public static float divide(int firstNumber,int secondNumber) {
	if (secondNumber == 0){
		return 0;
	}
	else
		return firstNumber / secondNumber;
	}
	
    public static int factorOf(int number) { 

        for (int index = 1; index <= number; index++) { 
            if (number % index == 0) {
                System.out.print(index + " ");
            }
        }
        System.out.println(); 
        return 0;
    }
    
    public static boolean isPerfectSquare(int number) { 
	double root = Math.sqrt(number);
	if (root == (int) root)
        return true;
    else
        return false;
        
    } 
    
    
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
    
    public static long factorialOf(int number) { 
		int factorial = 1;
     	for (int index = number; index >= 1; index--) {
     		factorial = factorial * index;	
     	} 
     	return factorial; 
    } 


    
     public static long squareOf(int number) { 
	return number * number;
    } 
	
	public static void main(String... args) {
	
	System.out.println(isEven(1));
	
	System.out.println(isPrime(17));
	
	System.out.println(subtract(16,8));
	
	System.out.println(divide(16,7));
	
	factorOf(10);
	
    System.out.println(isPerfectSquare(25));
    
    System.out.println(isPalindrome(54145));
    
    System.out.println(factorialOf(5));
	
    System.out.println(squareOf(5));
    
;
	
	}


}
