package RanasiaC;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
        int userChoice;
        double moneyChoice;
        double balance;
        int accountNumber;
        Account customer1=new Account();
        Checking customer1C=new Checking(0);
        Savings customer1S=new Savings(0);
        do{
        System.out.println("1. Withdraw from Checking\n" +
                "2. Withdraw from Savings\n" +
                "3. Deposit to Checking\n" +
                "4. Deposit to Savings\n" +
                "5. Balance of Checking\n" +
                "6. Balance of Savings\n" +
                "7. Award Interest to Savings now\n" +
                "8. Quit");
        userChoice=sc.nextInt();
        switch (userChoice){
            case 1:
                System.out.println("How much would you like to withdraw from Checking?");
                moneyChoice= sc.nextDouble();
                customer1C.withdrawal(moneyChoice);
                break;
            case 2:
                System.out.println("How much would you like to withdraw from Savings?");
                moneyChoice= sc.nextDouble();
                customer1S.withdrawal(moneyChoice);
                break;
            case 3:
                System.out.println("How much would you like to deposit into Checking?");
                moneyChoice=sc.nextDouble();
                customer1C.deposit(moneyChoice);
                System.out.println("Doing default deposit");
                break;
            case 4:
                System.out.println("How much would you like to deposit into Savings?");
                moneyChoice=sc.nextDouble();
                customer1S.deposit(moneyChoice);
                break;
            case 5:
                balance= customer1C.getAccountBalance();
                accountNumber= customer1C.getAccountNumber();
                System.out.println("Your balance for checking "+ accountNumber +" is "+balance);
                break;
            case 6:
                balance= customer1S.getAccountBalance();
                accountNumber= customer1S.getAccountNumber();
                System.out.println("Your balance for savings "+ accountNumber +" is "+balance);
                break;
            case 7:
                customer1S.interest();
                break;
        }
        }while(userChoice!=8);
    }
}
