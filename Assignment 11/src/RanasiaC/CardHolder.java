package RanasiaC;

class CardHolder implements Runnable {
    //attributes:
    private CreditCard customerCreditCard;
    CardHolder(){}
    //Overloaded constructor:
    CardHolder(CreditCard currentCreditCard){
        customerCreditCard=currentCreditCard;
    }
    //Methods:
    @Override
    public void run(){
        for (int i = 1; i <7 ; i++) {
            double balance=customerCreditCard.getCreditCardBalance();
            makeWithdrawal(500);
            if(balance<0){
                System.out.println("Account is Overdrawn");
            }
        }
    }
    public synchronized void makeWithdrawal(double withdrawalAmount){
        double balance=customerCreditCard.getCreditCardBalance();
        if(balance<withdrawalAmount){
            System.out.println("Not enough in: "+Thread.currentThread().getName()+"'s account to withdraw: $"+withdrawalAmount+
                    ", Balance: $"+balance);
        }
        else {
            System.out.println(Thread.currentThread().getName()+",before withdrawing $"+withdrawalAmount+
                    ", Balance: $"+balance);
            try{
                Thread.sleep(6000);
            }
            catch (InterruptedException interruptedException){
                System.out.println(interruptedException.getStackTrace().toString());
            }
            customerCreditCard.withdrawal(withdrawalAmount);
            System.out.println(Thread.currentThread().getName()+",after withdrawing $"+withdrawalAmount+
                    ", Balance: $"+balance);
        }

    }
}
