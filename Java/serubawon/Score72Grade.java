public class Score72Grade{

    public static void main(String [] args) {

        int integer = 72;
        String grade = "";


        if (integer >= 0 && integer <= 100){
            if (integer >= 90) 
                grade = "A";
            else
            if (integer >= 80)
               grade = "B";
            else
            if (integer >= 70)
               grade = "C"; 
            else
            if (integer < 70)
               grade = "F";             

} 
        else
            System.out.println("Invalid Score");

        System.out.println("Grade:" + grade);

}
}
