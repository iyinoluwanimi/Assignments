public class FactorOFInteger { 
    

    public static int factorOf(int number) { 

        for (int index = 1; index <= number; index++) { 
            if (number % index == 0) {
                System.out.print(index + " ");
            }
        } 
        return 0;
    } 

    public static void main (String... args) { 
        factorOf(10);
    } 
}

