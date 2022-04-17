package RanasiaC;

public class Account {
    private  int accountNumber;
    private static int accountNumberNext=10000;
    private double accountBalance;
    //constructor:
    Account(){
        accountBalance=0;
        accountNumber=accountNumberNext;
        accountNumberNext++;
    }
    Account(double accountBalance){
        this.accountBalance=accountBalance;
        accountNumber=accountNumberNext;
    }
    //getter and setters:
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }
    //methods:
    public void withdrawal(double withdrawalAmount){
        accountBalance=(accountBalance-withdrawalAmount);
    }
    public void deposit(double depositAmount){
        accountBalance=(accountBalance+depositAmount);
    }
}
