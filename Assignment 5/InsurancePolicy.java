package RanasiaC;

public abstract class InsurancePolicy {
    private String policyHolder;
    private int policyNumber;
    private static int numberOfPolicies=0;
    private double premium=0;
    //constructor
    InsurancePolicy(String policyHolder){
        this.policyHolder=policyHolder;
        policyNumber=numberOfPolicies++;
    }
    //setter and getters
    public void setPolicyHolder(String policyHolder){
        this.policyHolder=policyHolder;
    }
    public String getPolicyHolder(){
        return policyHolder;
    }
    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }
    public int getPolicyNumber() {
        return policyNumber;
    }
    public static void setNumberOfPolicies(int numberOfPolicies) {
        InsurancePolicy.numberOfPolicies = numberOfPolicies;
    }
    public static int getNumberOfPolicies() {
        return numberOfPolicies;
    }
    public void setPremium(double premium) {
        this.premium = premium;
    }
    public double getPremium() {
        return premium;
    }
    //Methods:
    public abstract void selectPolicyCoverage();
    public abstract void calculatePremium();
    @Override
    public String toString(){
        return
                "Policy Holder:"+policyHolder+
                "\nPolicy Number:"+policyNumber+
                "\nNumber of Policies:"+numberOfPolicies+
                "\nPremium:"+premium;
    }
    public String toString1(){
        return policyHolder+", "+policyNumber;
    }
}
