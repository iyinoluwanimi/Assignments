import java.util.Scanner;

public class CinemaSeatingChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char cinemaSeat[][] = new char[4][5];
        
        for(int row = 0; row < cinemaSeat.length; row++) {
            for(int column = 0; column < cinemaSeat[row].length; column++) {
                cinemaSeat[row][column] = 'O';
            }
        }
        System.out.println("Cinema Seating Chart");
        for(int row = 0; row < cinemaSeat.length; row++) {
            for(int column = 0; column < cinemaSeat[row].length; column++) {
                System.out.print(cinemaSeat[row][column] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter your seat row number: ");
        int rowInput = input.nextInt();
        
        System.out.print("Enter your seat column number: ");
        int columnInput = input.nextInt();
        
        int rowIndex = rowInput - 1;
        int columnIndex = columnInput - 1;
        
        if (rowIndex >= 0 && rowIndex < 4 && columnIndex >= 0 && columnIndex < 5) {
            
            if (cinemaSeat[rowIndex][columnIndex] == 'O') {
                cinemaSeat[rowIndex][columnIndex] = 'X';
                
                System.out.println("Updated Seating Chart:");
                for(int row = 0; row < cinemaSeat.length; row++) {
                    for(int column = 0; column < cinemaSeat[row].length; column++) {
                        System.out.print(cinemaSeat[row][column] + " ");
                    }
                    System.out.println();
                }
            } 
                else {
                    System.out.println("Sorry, seat already occupied.");
                }
        } 
            else {
                System.out.println("Invalid row or seat selection!");
            }     
    }
}
              
            
       
    
    
                
               
               
