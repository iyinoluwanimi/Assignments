public class PrimeNumbersFrom1to100 {

    public static void main(String[] args) {
        int numberOfCount = 0;
        for (int number = 1; number <= 100; number++) {

            int count = 0;
            
            for (int divisor = 1; divisor <= number; divisor++) {

                if (number % divisor == 0) {
                    count++;
                }
            }
            
            if (count == 2) {
                System.out.println(number);
                numberOfCount++;
            }
            
        }
        System.out.printf("The total Prime Number within 1 to 100 is: %d%n",numberOfCount);
    }
}
