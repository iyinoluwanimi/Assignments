public class CalculatingTheValueOfPie {

public static void main(String [] args) {

double pie = 4;
int count = 1;
int pieCount = 0;

	for (double index = 3;index < 200000; index+=2) {
	 if (count % 2 == 0)
   		 pie = pie - 4/index;
     else
 	    pie = pie + 4/index;

     count++;

}
	if (pie >= 3.14159 && pie < 3.14160) {
		
		pieCount = count;
		System.out.println(pieCount);

	}
}
}
