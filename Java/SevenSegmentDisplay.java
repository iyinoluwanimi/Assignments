import java.util.Scanner;

public class SevenSegmentDisplay {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("Enter an 8-bit binary value: ");
            String number = input.nextLine();

            char[][] display = new char[5][4];

            for (int i = 0; i < display.length; i++) {
                for (int j = 0; j < display[i].length; j++) {
                    display[i][j] = ' ';
                }
            }

            if (number.charAt(0) == '0') {
                display[0][0] = '#';
                display[0][1] = '#';
                display[0][2] = '#';
                display[0][3] = '#';
            }

            if (number.charAt(1) == '0') {
                display[1][0] = '#';
            }

            if (number.charAt(2) == '0') {
                display[1][3] = '#';
            }

            if (number.charAt(3) == '0') {
                display[2][0] = '#';
                display[2][1] = '#';
                display[2][2] = '#';
                display[2][3] = '#';
            }

            if (number.charAt(4) == '0') {
                display[3][0] = '#';
            }

            if (number.charAt(5) == '0') {
                display[3][3] = '#';
            }

            if (number.charAt(6) == '0') {
                display[4][0] = '#';
                display[4][1] = '#';
                display[4][2] = '#';
                display[4][3] = '#';
            }

            for (int i = 0; i < display.length; i++) {
                for (int j = 0; j < display[i].length; j++) {
                    System.out.print(display[i][j]);
                }
                System.out.println();
            }
        }
    }
}
