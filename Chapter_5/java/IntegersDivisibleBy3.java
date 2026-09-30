public class IntegersDivisibleBy3 {

public static void main(String [] args) {
	int sum = 0;
	for (int index = 1;index <= 30;index++) {
	
		if (index % 3 == 0)
			sum = sum + index;
}
	System.out.println(sum);
}
}

