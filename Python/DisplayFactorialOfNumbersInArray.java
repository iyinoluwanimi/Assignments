import java.util.Arrays;
public class DisplayFactorialOfNumbersInArray {

	public static void main(String... args) {
	
	int [] result = {1,2,3,4,5,6,7,8,9,12,16,25};
	System.out.println(Arrays.toString(result));
	}

	public static int[] displayFactorialInArray (int[] numbers) {
	
		int [] factorialOfNumbersInArray = new int [numbers.length];
		int count = 0;
		
		for (int index1 = 0; index1 < numbers.length; index1++) {
			int factorial = 1;
			for (int index2 = 1; index2 <= numbers[index1]; index2++) {
				factorial = factorial * index2;
			}
			factorialOfNumbersInArray[count] = factorial;
			count++;
		}
		return factorialOfNumbersInArray;
	}

}
