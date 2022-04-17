package RanasiaC;

public class Checking_Account extends Bank_Account {
    //variables:
    private double dailyWithdrawalLimit;
    //Constructor:
    Checking_Account(String cFName, String cUserID, String cUserPassword) {
        super(cFName, cUserID, cUserPassword);
        dailyWithdrawalLimit=300;
    }
    //getter and setter:
    public double getDailyWithdrawalLimit(){
        return dailyWithdrawalLimit;
    }
    public void setDailyWithdrawalLimit(double dailyWithdrawalLimit){
        this.dailyWithdrawalLimit=dailyWithdrawalLimit;
    }
}
