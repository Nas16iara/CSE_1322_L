package RanasiaC;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int userChoice;
    Scanner sc=new Scanner(System.in);
        Quiz userQuiz= new Quiz();
        do{
            System.out.print("What would you like to do?\n"+"1. Add a question to the quiz\n"+
            "2. Remove a question from the quiz\n"+
            "3. Modify a question in the quiz\n"+
            "4. Take the quiz\n"+
            "5. Quit\n");
            userChoice=sc.nextInt();
            switch(userChoice){
                case 1:
                    userQuiz.add_question();
                    break;
                case 2:
                    userQuiz.remove_question();
                    break;
                case 3:
                    userQuiz.modify_question();
                    break;
                case 4:
                    userQuiz.give_quiz();
                    break;
            }

    }while(userChoice!=5);
    }
}
