import java.util.Scanner;
public class ReverseString {

	public static void main(String... args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word = input.next();
		
		int count = 0;
		int counter = 0;
		int i;
		
		for (int index = 0; index <= word.length() - 1; index++) {
		
			for (i = word.length() - 1; i >= 0; i-- ) {
				System.out.print(word.charAt(i));
				char letter = word.charAt(i);
				
				if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u') || (letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U')) {
					count++;
				}
				if (word.charAt(index) == word.charAt(i))
				counter++;
			}
			
			
		}
		System.out.println();
		System.out.println(count);
		System.out.println(counter);
	}

}
