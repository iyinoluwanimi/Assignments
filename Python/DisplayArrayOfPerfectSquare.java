import java.util.Arrays;
public class DisplayArrayOfPerfectSquare {

	public static int[] displayArrayOfPerfectSquare(int [] numbers) {
	
		int [] arrayOfPerfectSquare = new int [numbers.length];
		int count = 0;
		for (int index = 0;index < numbers.length; index++) {
		
			double squareRootOfNumber = Math.sqrt(numbers[index]);
			if (numbers[index] / (int)(squareRootOfNumber)== squareRootOfNumber) {
				arrayOfPerfectSquare[count] = numbers[index];
				count++;
			}
		
		}
		
		return arrayOfPerfectSquare;
		
	}
	
	public static void main(String... args) {
	
		int [] result = {1,2,3,4,5,6,7,8,9,12,16,25};
		System.out.print(Arrays.toString(displayArrayOfPerfectSquare(result)));
		
	}

}
