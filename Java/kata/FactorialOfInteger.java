public class FactorialOfInteger { 
    

    public static long factorialOf(int number) { 
		int factorial = 1;
     	for (int index = number; index >= 1; index--) {
     		factorial = factorial * index;	
     	} 
     	return factorial; 
    } 

    public static void main (String... args) { 
        System.out.println(factorialOf(5));
    } 
}

