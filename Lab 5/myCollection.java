package RanasiaC;
import java.util.Scanner;
public class myCollection {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        char userChoice;
        String title;
        String author;
        long isbn_Number;
        int issueNumber;
        Item[] bAndPCollection = new Item[5];
        for (int i = 0; i < bAndPCollection.length; i++) {
            System.out.println("Please enter B for Book or P for Periodical");
            userChoice=sc.next().charAt(0);
            if(userChoice=='B'||userChoice=='b'){
                sc.nextLine();
                System.out.println("Please enter the name of the Book");
                title=sc.nextLine();
                System.out.println("Please enter the author of the Book");
                author=sc.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                isbn_Number=sc.nextLong();
                Book newBook= new Book(title,isbn_Number,author);
                bAndPCollection[i]=newBook;
            }
            else if(userChoice=='p'||userChoice=='P'){
                sc.nextLine();
                System.out.println("Please enter the name of Periodical");
                title=sc.nextLine();
                System.out.println("Please enter the issue number");
                issueNumber=sc.nextInt();
                Periodical newPeriodical=new Periodical(title,issueNumber);
                bAndPCollection[i]=newPeriodical;
            }
        }
        System.out.println("Your Items: ");
        for (int j = 0; j < bAndPCollection.length; j++) {
            System.out.println(bAndPCollection[j].getListing());
            System.out.println();
        }
    }
}
