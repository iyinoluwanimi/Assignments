import java.util.Scanner;
import java.util.Arrays;
public class SolveForFiveNumbers {
	
	
public static void main (String [] args) {

Scanner input = new Scanner(System.in);

double[] array = new double[5];
	int index = 0;
	for (;index <5; index++) {
	
	System.out.println("Enter a Number:");
	double number= input.nextDouble();
	
	array[index] = number;
		
	
	}
	System.out.println(Arrays.toString(array));
	
	double largest = array[0];
	
	for (int counter = 0; counter < array.length;counter++) {
		if (array[counter] > largest){
		largest = array[counter];
		} 
		
}
	
	double smallest = array[0];
	
	for (int count = 0; count < array.length;count++) {
		if (array[count] < smallest){
		smallest = array[count];
		} 
	
	}
		

	

	
	double average = (array[0]+ array[1]+ array[2]+ array[3] + array[0])/5;

	System.out.printf("The largest number is %f%n",largest);
	System.out.printf("The smallest number is %f%n",smallest);	
	System.out.printf("The average of the numbers is %f%n",average);
}
}
