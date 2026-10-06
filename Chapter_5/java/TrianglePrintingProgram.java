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
        for (int k = 1; k <= 10; k++) {
			for (int m = 1; m <= k-1; m++) {
				System.out.print(" ");
			}
		    for (int l = 10; l >= k; l--) {
		        System.out.print("*");
		    }
		     System.out.println();
		    }
		    System.out.println();
		    
		for (int i = 1; i <= 10; i++) {
			for (int l = 10; l >= i; l--) {
		        System.out.print(" ");
		    }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();   
        
    }
}

