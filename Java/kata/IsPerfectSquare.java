public class IsPerfectSquare { 
    

    public static boolean isPerfectSquare(int number) { 
	double root = Math.sqrt(number);
	if (root == (int) root)
        return true;
    else
        return false;
        
    } 

    public static void main (String... args) { 
        System.out.println(isPerfectSquare(25));
    } 
}

