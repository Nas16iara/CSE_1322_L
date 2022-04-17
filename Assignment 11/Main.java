package RanasiaC;

public class Main {

    public static void main(String[] args) {
        //with Synchronization:
        CreditCard customerCreditCard = new CreditCard();
        CardHolder customerCardHolder= new CardHolder(customerCreditCard);
        Thread John=new Thread(customerCardHolder);
        John.setName("John");
        Thread Mary=new Thread(customerCardHolder);
        Mary.setName("Mary");
        John.start();
        Mary.start();
    }
}
