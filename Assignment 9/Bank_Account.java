package RanasiaC;

public class Bank_Account{
    //variables
    private String cFName;
    private int uniqueAccountId=0;
    private static int numberOfAccount=0;
    private String cUserID;
    private String cUserPassword;
    private double cAccountBalance;
    //constructors:
    Bank_Account(String cFName,String cUserID,String cUserPassword){
        this.cFName=cFName;
        this.cUserID=cUserID;
        this.cUserPassword = cUserPassword;
        uniqueAccountId=numberOfAccount;
        numberOfAccount++;
    }
    //getters and setters:
    public String getCFName(){
        return cFName;
    }
    public void setCFName(String cFName){
        this.cFName=cFName;
    }
    public String getCUserID(){
        return cUserID;
    }
    public void setCUserId(String cUserId){
        this.cUserID=cUserId;
    }
    public String getCUserPassword(){
        return cUserPassword;
    }
    public void setCUserPassword(String cUserPassword){
        this.cUserPassword=cUserPassword;
    }
    public double getCAccountBalance(){
        return cAccountBalance;
    }
    public void setCAccountBalance(double cAccountBalance){
        this.cAccountBalance=cAccountBalance;
    }
    public int getUniqueAccountId(){
        return uniqueAccountId;
    }
    public int getNumberOfAccount(){
        return numberOfAccount;
    }
    //Methods:
    public static void decreaseNumberOfAccounts(){
        numberOfAccount--;
    }
    public double deposit_amount(double deposit){
        cAccountBalance=(deposit+cAccountBalance);
        return cAccountBalance;
    }
    public double withdrawal_amount(double withdrawal){
        cAccountBalance=(cAccountBalance-withdrawal);
        return cAccountBalance;
    }
}
