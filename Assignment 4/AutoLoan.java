package RanasiaC;

public class AutoLoan extends Loan {
    private double downPayment;

    AutoLoan(String customerName, double loanBalance, double interestRate, int numberOfMonthlyPayment, double downPayment) {
        new Loan(customerName, loanBalance, interestRate, numberOfMonthlyPayment);
        this.downPayment = downPayment;
        setCustomerName(customerName);
        setLoanBalance(loanBalance);
        setInterestRate(interestRate);
        setNumberOfMonthlyPayment(numberOfMonthlyPayment);

    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getDownPayment() {
        return downPayment;
    }

    @Override
    public void calculateMonthlyPayment() {
        final double CONVERSION_FOR_RATE=0.01;
        double PV = (getLoanBalance() - downPayment);
        double r = getInterestRate()*CONVERSION_FOR_RATE;
        int n = getNumberOfMonthlyPayment();
        double p=((r*(PV))/(1-(Math.pow((1+r),-n))));
        setMonthlyPayment(p);
    }

    public String toString() {
        String string =
                "Customer Name: " + getCustomerName() + ",Account Number: " + getAccountNumber()
                        + ",Loan Balance: " + getLoanBalance() + ",Monthly Payment: " + getMonthlyPayment()
                        + ",Interest Rate: " + getInterestRate() + ",Number of Monthly Payment: " + getNumberOfMonthlyPayment()
                        + ",Down Payment: " + downPayment;
        return string;
    }
}