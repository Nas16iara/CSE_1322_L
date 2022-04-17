package RanasiaC;
import java.lang.Math;
public class Loan {
    private String customerName;
    private int accountNumber;
    private double loanBalance;
    private double monthlyPayment;
    private double interestRate;
    private int numberOfMonthlyPayment;
    private static int numberOfLoans=0;
    private static int nextNumberOfAccount=1;
    //constructors
    Loan(){
        accountNumber=nextNumberOfAccount;
        nextNumberOfAccount++;
    }
    Loan(String customerName,double loanBalance,double interestRate, int numberOfMonthlyPayment){
        this.customerName=customerName;
        this.loanBalance=loanBalance;
        this.interestRate=interestRate;
        this.numberOfMonthlyPayment=numberOfMonthlyPayment;
        numberOfLoans=numberOfLoans++;
        accountNumber=nextNumberOfAccount;
    }
    //getters and setters
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setLoanBalance(double loanBalance){
        this.loanBalance=loanBalance;
    }
    public void setMonthlyPayment(double monthlyPayment){
        this.monthlyPayment=monthlyPayment;
    }
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    public void setNumberOfMonthlyPayment(int numberOfMonthlyPayment){
        this.numberOfMonthlyPayment=numberOfMonthlyPayment;
    }
    public String getCustomerName(){
        return customerName;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getLoanBalance(){
        return loanBalance;
    }
    public double getMonthlyPayment(){
        return monthlyPayment;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public int getNumberOfMonthlyPayment(){
        return numberOfMonthlyPayment;
    }
    public static int getNumberOfLoans(){
        return numberOfLoans;
    }
    //methods:
    void decreaseNumberOfLoans(){
        numberOfLoans--;
    }
    public void calculateMonthlyPayment(){
        final double CONVERSION_FOR_RATE=0.01;
        double PV=loanBalance;
        double r=interestRate*CONVERSION_FOR_RATE;
        int n=numberOfMonthlyPayment;
        double p=((r*(PV))/(1-(Math.pow((1+r),-n))));
        monthlyPayment=p;
    }
    public String toString(){
        String string=
                "Customer Name: "+customerName+",Account Number: "+accountNumber
                +",Loan Balance: "+loanBalance+",Monthly Payment: "+monthlyPayment
                +",Interest Rate: "+interestRate+",Number of Monthly Payment: "+numberOfMonthlyPayment;
        return string;
    }
}
