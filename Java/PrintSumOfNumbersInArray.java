public class PrintSumOfNumbersInArray { 

	public static void main(String... args) {
	int [] numbers = {3,5,7,8,12,10};
	System.out.println(sumOfNumbers(numbers));

	}

	public static int sumOfNumbers(int[] numbers) {
	int sum = 0;
	
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum;
	
	}

}
