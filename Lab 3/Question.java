package RanasiaC;

public class Question {
    private String questionText;
    private String answer;
    private int levelOfDifficulty;
    Question(String questionText,String answer,int levelOfDifficulty){
        this.questionText=questionText;
        this.answer=answer;
        this.levelOfDifficulty=levelOfDifficulty;
    }
    //setters:
    public void setQuestionText(String questionText){
        this.questionText = questionText;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
    public void setLevelOfDifficulty(int levelOfDifficulty){
        this.levelOfDifficulty=levelOfDifficulty;
    }
    //getters:
    public String getQuestionText(){
        return questionText;
    }
    public String getAnswer(){
        return answer;
    }
    public int getLevelOfDifficulty(){
        return levelOfDifficulty;
    }
}
