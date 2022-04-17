package RanasiaC;

public class CreditCard {
    //attributes:
    private double creditCardBalance;
    //constructor:
    CreditCard(){
        creditCardBalance=5000.00;
    }
    //Methods including getter:
    public void withdrawal(double withdrawalAmount){
        this.creditCardBalance=(creditCardBalance-withdrawalAmount);
    }
    public double getCreditCardBalance() {
        return creditCardBalance;
    }
}
