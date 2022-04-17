package RanasiaC;

 public abstract class Item {
    private String title;

    Item(){
        //default constructor
    title="";
    }
    Item(String title){
        this.title=title;
    }
    //getters and setters
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle() {
        return title;
    }
    // Methods
    public abstract String getListing();
     public String toString(){
         String string= "Title: "+title;
         return string;
     }
}
