public class FinalBalanceWithInterest {

    public static void main(String [] args) {

        double balance = 5000.00;

        balance = balance + 1200.50;

        balance = balance - 750.25;
    
        balance = balance + balance * (1.5 /100);

        System.out.printf("Your final balance %.2f%n",balance);


}
}
