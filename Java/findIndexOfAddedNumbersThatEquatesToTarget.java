import java.util.Arrays;
public class findIndexOfAddedNumbersThatEquatesToTarget {

  public static void main(String... args) {
  int [] result = {2,7,11,15};
  System.out.print(returnIndicesToGetTargetNumber(result,9));
    
  
  }

  public static String returnIndicesToGetTargetNumber (int [] numbers, int target) {
    String result = "";
    for(int index1 = 0; index1 < numbers.length; index1++) {
      for (int index2 = index1 + 1; index2 < numbers.length; index2++) {
        
        if (numbers[index1] + numbers[index2] == target) {
  
          result += "["+index1+","+index2+"]";
          
        }
      
      }
    
    }
        return result;
  }
}
