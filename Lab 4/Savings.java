package RanasiaC;

public class Savings extends Account{
    Savings(double checkingBalance){
        new Account(checkingBalance);
    }
    @Override
    public void withdrawal(double savingsWithdrawal){
        double savingsAmount;
        double savingsBalance=getAccountBalance();
        final int WITHDRAW_AMOUNT=10;
        savingsAmount=savingsBalance-savingsWithdrawal;
        if(savingsAmount<500){
            System.out.println("Charging a fee of $10 because you are below $500");
            savingsWithdrawal=(savingsWithdrawal+WITHDRAW_AMOUNT);
        }
            savingsAmount=savingsBalance-savingsWithdrawal;
            setAccountBalance(savingsAmount);
    }
    private static int depositTracker=0;
    @Override
    public void deposit(double savingDeposit){
        double savingsAmount;
        depositTracker++;
        final int WITHDRAWAL_DEPOSIT_FEE=10;
        double savingsBalance=getAccountBalance();
        System.out.println("This is deposit "+depositTracker+" to this account");
        if(depositTracker>=6){
            System.out.println("Charging a fee of $10.");
            savingDeposit=(savingDeposit-WITHDRAWAL_DEPOSIT_FEE);
        }
        savingsAmount=(savingsBalance+savingDeposit);
        setAccountBalance(savingsAmount);

    }
    //methods:
    void interest(){
        double savingsBalance=getAccountBalance();
        final double addingInterest=0.015;
        double interestAdded=(savingsBalance*addingInterest);
        savingsBalance=(savingsBalance+interestAdded);
        System.out.println("Customer earned "+interestAdded+"in interest");
        setAccountBalance(savingsBalance);
    }
}
