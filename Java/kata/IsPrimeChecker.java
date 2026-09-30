public class IsPrimeChecker{

	public static boolean isPrime(int number){
		int count = 0;
		for (int index = 1; index <= number; index++)
		if (number % index == 0)
			count++;
		if (count == 2)
			return true;
		else
			return false;
	}

}
