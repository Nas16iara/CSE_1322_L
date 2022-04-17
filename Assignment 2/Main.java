package RanasiaC;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int userChoice;
        String userMessage;
        Scanner sc=new Scanner(System.in);
        Encryption userSecret= new Encryption();
	    do{
        System.out.println(
            "1 Encrypt a message\n" +
            "2 Decrypt a message\n" +
            "3 Quit\n" +
            "Enter Choice: ");
        userChoice= sc.nextInt();
        if(userChoice>1&&userChoice>3){
            System.out.println("Error: Please enter valid input");
        }
        else{
        switch (userChoice){
            case 1:
                System.out.println("Enter the plain text message: ");
                userMessage=sc.next();
                System.out.println(userSecret.encrypt_message(userMessage));
                break;
            case 2:
                System.out.println("Enter the encrypted message: ");
                userMessage=sc.next();
                System.out.println(userSecret.decrypt_message(userMessage));
                }
            }
        }while(userChoice!=3);
    }
}
