package RanasiaC;

public class HealthInsurancePolicy extends InsurancePolicy implements Deductible {
    private double deductibleLimit;
    private double totalDeductiblePaid = 0;
    private double coPayment;
    private double totalCoPaymentPaid=0;
    private double totalOutOfPocket;
    //constructor
    HealthInsurancePolicy(String policyHolder,double deductibleLimit,double coPayment,double totalOutOfPocket){
        super(policyHolder);
        policyHolder=getPolicyHolder();
        this.deductibleLimit=deductibleLimit;
        this.coPayment=coPayment;
        this.totalOutOfPocket=totalOutOfPocket;
    }
    //getter and setters:
    public void setDeductibleLimit(double deductibleLimit){
        this.deductibleLimit=deductibleLimit;
    }
    public double getDeductibleLimit(){
        return deductibleLimit;
    }
    public void setTotalDeductiblePaid(double totalDeductiblePaid){
        this.totalDeductiblePaid=totalDeductiblePaid;
    }
    public double getTotalDeductiblePaid(){
        return totalDeductiblePaid;
    }
    public void setCoPayment(double coPayment){
        this.coPayment=coPayment;
    }
    public double getCoPayment(){
        return coPayment;
    }
    public void setTotalCoPaymentPaid(double totalOutOfPocket){
        this.totalCoPaymentPaid=totalCoPaymentPaid;
    }
    public double getTotalCoPaymentPaid(){
        return totalCoPaymentPaid;
    }
    public void setTotalOutOfPocket(double totalOutOfPocket){
        this.totalOutOfPocket=totalOutOfPocket;
    }
    public double getTotalOutOfPocket(){
        return totalOutOfPocket;
    }
    //Methods:
    public void selectPolicyCoverage(){
        System.out.println("selecting policy coverages");
    }
    public void calculatePremium(){
        System.out.println("calculating and updating premium");
    }
    @Override
    public boolean hasMetDeductible() {
        boolean hasOrNotMetDeductible;
        if(totalDeductiblePaid>=deductibleLimit){
            hasOrNotMetDeductible=true;
        }
        else{
            hasOrNotMetDeductible=false;
        }
        return hasOrNotMetDeductible;
    }
    @Override
    public boolean hasMetOutOfPocket(){
        boolean hasOrNotMetOutOfPocket;
        double addedUpTotalDedCoPay=(totalCoPaymentPaid+totalDeductiblePaid);
        if(addedUpTotalDedCoPay>=totalOutOfPocket){
            hasOrNotMetOutOfPocket=true;
        }
        else {
            hasOrNotMetOutOfPocket = false;
        }
        return hasOrNotMetOutOfPocket;
    }
    @Override
    public String toString(){
        return
                "Policy Holder:"+getPolicyHolder()+
                "\nPolicy Number:"+getPolicyNumber()+
                "\nMet Deductible:"+hasMetDeductible()+
                "\nMet Out Of Pocket:"+hasMetOutOfPocket()+
                "\nDeducible Limit:"+deductibleLimit+
                "\nTotal Deducible Paid:"+totalDeductiblePaid+
                "\nCo-Payment:"+coPayment+
                "\nTotal Co-Payment Paid:"+totalCoPaymentPaid+
                "\nTotal Out Of Pocket:"+totalOutOfPocket;
    }
    @Override
    public String toString1(){
        return
                super.toString1()+" Met Deductible: "+hasMetDeductible()+", Met Total Out-of-Pocket:"+hasMetOutOfPocket();
    }
}