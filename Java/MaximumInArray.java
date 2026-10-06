public class MaximumInArray {

public static void main(String... args) {
	int [] numbers = new int [] {10,20,30,40,50};
	System.out.println(sumOfNumbers(numbers));
	
}

public static int sumOfNumbers(int [] numbers) {
	int sum = 0;
	for (int index = 0; index < numbers.length; index++) {
		sum = sum + numbers[index];
	}
	return sum;

}

}
