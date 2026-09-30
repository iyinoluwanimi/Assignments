public class ChapterFiveQuestionThree {
	public static void main(String... args) {
		int sum = 0;
		for (int count = 1;count<100;count++) {
			if (count % 2 == 1) {
				sum = sum + count;
			}
		}
		System.out.println(sum);
		System.out.println(Math.pow(2.5,3));
		int i=1;
		while(i<=20) {
			System.out.print(i);
			if (i % 5 == 0) {
				System.out.println();
			}
			else
				System.out.print("\t");	
			i++;
		}
		for(int index = 1; index <= 20;index++) {
			System.out.print(index);
			if (index % 5 == 0) {
				System.out.println();
			}
			else
				System.out.print("\t");	
		
		}
		
		}
		
		
		
	}
