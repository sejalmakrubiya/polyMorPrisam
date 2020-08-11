public class CalculationClass {
    public static void main(String[] args) {
        BankInterest bankInterest =new BankInterest();
        BankInterest bankInterest1=new BarclaysBank();
        BankInterest bankInterest2=new HsbcBank();

        bankInterest.interest(500);
        bankInterest1.interest(500);
        bankInterest2.interest(500);
        BarclaysBank barclaysBank= new BarclaysBank();
        barclaysBank.interest(500,2);

    }
}
