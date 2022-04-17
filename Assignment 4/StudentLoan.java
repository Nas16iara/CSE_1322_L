package RanasiaC;

public class StudentLoan extends Loan {
    private boolean isDeferred;
    //constructor
    StudentLoan(String customerName,double loanBalance,double interestRate, int numberOfMonthlyPayment,boolean isDeferred){
        new Loan(customerName,loanBalance,interestRate,numberOfMonthlyPayment);
        setCustomerName(customerName);
        setLoanBalance(loanBalance);
        setInterestRate(interestRate);
        setNumberOfMonthlyPayment(numberOfMonthlyPayment);
        this.isDeferred=isDeferred;
    }
    //getters and setters:
    public void setIsDeferred(boolean isDeferred){
        this.isDeferred=isDeferred;
    }
    public boolean getIsDeferred(){
        return isDeferred;
    }
    @Override
    public void calculateMonthlyPayment(){
       if(isDeferred){
           setMonthlyPayment(0);
       }
       else {
           final double CONVERSION_FOR_RATE=0.01;
           double PV = getLoanBalance();
           double r = getInterestRate()*CONVERSION_FOR_RATE;
           int n = getNumberOfMonthlyPayment();
           double p=((r*(PV))/(1-(Math.pow((1+r),-n))));
           setMonthlyPayment(p);
       }
    }
    @Override
    public String toString(){
        return "Customer Name: "+getCustomerName()+",Account Number: "+getAccountNumber()
                +",Loan Balance: "+getLoanBalance()+",Monthly Payment: "+getMonthlyPayment()
                +",Interest Rate: "+getInterestRate()+",Number of Monthly Payment: "+getNumberOfMonthlyPayment()
                +",Deferment: "+isDeferred;
    }
}
