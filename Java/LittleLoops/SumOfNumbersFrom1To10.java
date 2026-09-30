public class SumOfNumbersFrom1To10 {

	public static void main(String [] args) {
	
		int index = 1;
		int product = 1;

		while (index<=10) {
		product = index * product;
		index++;
		}
		
		System.out.println(product);
	
	}

}
