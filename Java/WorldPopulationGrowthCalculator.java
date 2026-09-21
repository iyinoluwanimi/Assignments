import java.util.Scanner;
public class WorldPopulationGrowthCalculator {
public static void main (String[]args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter World Population: ");
    long worldPopulation = input.nextLong();

    System.out.println("Enter Growth rate per year in decimal e.g 0.8 : ");
    float growthRate = input.nextFloat();

    
    long estimatedPopulationInOneYear = (long)(worldPopulation * (growthRate));
    long estimatedPopulationInTwoYears = (long)(worldPopulation * (1 + growthRate/100 * 2));
    long estimatedPopulationInThreeYears = (long)(worldPopulation * (1 + growthRate/100 * 3));
    long estimatedPopulationInFourYears = (long)(worldPopulation * (1 + growthRate/100 * 4));
    long estimatedPopulationInFiveYears = (long)(worldPopulation * (1 + growthRate/100 * 5));

    System.out.printf("The World estimated Population is %d People in One year %n",estimatedPopulationInOneYear);
    System.out.printf("The World estimated Population is %d People in Two years %n",estimatedPopulationInTwoYears);
    System.out.printf("The World estimated Population is %d People in Three years %n",estimatedPopulationInThreeYears);
    System.out.printf("The World estimated Population is %d People in Four years %n",estimatedPopulationInFourYears);
    System.out.printf("The World estimated Population is %d People in Five years %n",estimatedPopulationInFiveYears);    
}
    

}
