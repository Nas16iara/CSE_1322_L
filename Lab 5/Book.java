package RanasiaC;

public class Book extends Item {
    private long isbn_number;
    private String author;
    //constructors:
    Book(){
        //default constructor
    }
    Book(String title,long isbn_number,String author){
        setTitle(title);
        this.isbn_number=isbn_number;
        this.author=author;
    }
    //getter and setters:
    public void setIsbn_number(long isbn_number){
        this.isbn_number=isbn_number;
    }
    public void setAuthor(String Author){
        this.author=author;
    }
    public long getIsbn_number(){
        return isbn_number;
    }
    public String getAuthor(){
        return author;
    }
    //methods:

    @Override
    public String getListing() {
        String string="Book Name - "+getTitle()+"\nAuthor - "+author+"\nISBN #-"+isbn_number;
        return string;
    }
}
