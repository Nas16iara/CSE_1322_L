package RanasiaC;

public class TermLifeInsurancePolicy extends InsurancePolicy{
    private String beneficiary;
    private int term;
    private double termPayout;
    //constructors:
    TermLifeInsurancePolicy(String policyHolder, String beneficiary,int term,double termPayout){
        super(policyHolder);
        policyHolder=getPolicyHolder();
        this.beneficiary=beneficiary;
        this.term=term;
        this.termPayout=termPayout;
    }
    //setters and getters:
    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }
    public String getBeneficiary() {
        return beneficiary;
    }
    public void setTerm(int term) {
        this.term = term;
    }
    public int getTerm() {
        return term;
    }
    public void setTermPayout(double termPayout) {
        this.termPayout = termPayout;
    }
    public double getTermPayout() {
        return termPayout;
    }
    //methods
    public void selectPolicyCoverage(){
        System.out.println("selecting policy coverages");
    }
    public void calculatePremium(){
        System.out.println("selecting policy coverages");
    }
    @Override
    public String toString(){
        return
                "Policy Holder:"+getPolicyHolder()+
                "\nPolicy Number:"+getPolicyNumber()+
                "\nPremium:"+getPremium()+
                "\nBeneficiary:"+beneficiary+
                "\nTerm:"+term+
                "\nTerm Payout:"+termPayout;
    }
    @Override
    public String toString1(){
     return super.toString1();
    }
}
