public class TrianglePrintingProgram {

    public static void main(String... args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
        for (int k = 1; k <= 10; k++) {

            for (int l = 10; l >= k; l--) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
        for (int m = 1; m <= 10; m++) {
			for (int n = 0; n <=m-1; n++){
				System.out.print(" ");
		        for (int o = 10; o >= m; o--) {
		            System.out.print("*");
		        }
			}
            System.out.println();
        }
        
    }
}

