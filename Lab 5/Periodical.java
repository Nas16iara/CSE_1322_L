package RanasiaC;

public class Periodical extends Item {
    private int issueNum;
    //constructors:
    Periodical(){

    }
    Periodical(String title,int issueNum){
        setTitle(title);
        this.issueNum=issueNum;
    }
    //getters and setters:
    public void setIssueNum(int issueNum){
        this.issueNum=issueNum;
    }
    public int getIssueNum(){
        return issueNum;
    }
    //methods:
    @Override
    public String getListing(){
        String string="Periodical Title - "+getTitle()+"\nIssue # - "+issueNum;
        return string;
    }
}
