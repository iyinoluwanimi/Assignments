import java.util.Array;
public class Final {

public static void main (String...args) {

	final int [] scores = {1,2,3};
	//scores = {1,2,3};
  scores[2] = 50;
    
  System.out.println(toString(scores));
}


}
