public class AsciiArtRenderer {

    public static void main(String[] args) {

        char[][] array = new char[9][9];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
            }
        }

        array[0][4] = '*';

        array[1][3] = '*';
        array[1][4] = '*';
        array[1][5] = '*';

        array[2][2] = '*';
        array[2][3] = '*';
        array[2][4] = '*';
        array[2][5] = '*';
        array[2][6] = '*';

        array[3][1] = '*';
        array[3][2] = '*';
        array[3][3] = '*';
        array[3][4] = '*';
        array[3][5] = '*';
        array[3][6] = '*';
        array[3][7] = '*';

        array[4][0] = '*';
        array[4][1] = '*';
        array[4][2] = '*';
        array[4][3] = '*';
        array[4][4] = '*';
        array[4][5] = '*';
        array[4][6] = '*';
        array[4][7] = '*';
        array[4][8] = '*';

        array[5][1] = '*';
        array[5][2] = '*';
        array[5][3] = '*';
        array[5][4] = '*';
        array[5][5] = '*';
        array[5][6] = '*';
        array[5][7] = '*';

        array[6][2] = '*';
        array[6][3] = '*';
        array[6][4] = '*';
        array[6][5] = '*';
        array[6][6] = '*';

        array[7][3] = '*';
        array[7][4] = '*';
        array[7][5] = '*';

        array[8][4] = '*';

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
