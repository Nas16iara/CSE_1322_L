package RanasiaC;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void createAccount(ArrayList<Bank_Account>customers) throws InvalidPasswordFormatException{
        String name;
        String userID;
        String password;
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter User ID: ");
        userID = sc.nextLine();
        System.out.print("Enter User Password: ");
        password = sc.nextLine();
        if(password.length()<9||!password.contains("*")){
            System.out.println("Error: Must Enter a Valid Password");
            throw new InvalidPasswordFormatException("Invalid Password Format");
        }
        else {
            Bank_Account newCustomer = new Checking_Account(name, userID, password);
            customers.add(newCustomer.getUniqueAccountId(), newCustomer);
        }
        }
    public static void deleteAccount(ArrayList<Bank_Account>customers) throws CustomerAccountNotFoundException{
        String userID;
        String password;
        sc.nextLine();
        System.out.print("Enter User ID: ");
        userID = sc.nextLine();
        System.out.print("Enter User Password: ");
        password = sc.nextLine();
        for(Bank_Account findCustomer: customers){
            String testingName=findCustomer.getCUserID();
            String testPassword=findCustomer.getCUserPassword();
            if(testingName.equalsIgnoreCase(userID)&&testPassword.equals(password)){
                customers.remove(findCustomer);
                findCustomer.decreaseNumberOfAccounts();
            }
            else{
                System.out.println("Error: Must Enter a Valid User ID and Password");
                throw new CustomerAccountNotFoundException("Customer Account Not Found");
            }
        }
    }
    public static void deposit(ArrayList<Bank_Account>customers)throws CustomerAccountNotFoundException,NegativeDollarAmountException{
        sc.nextLine();
        System.out.print("Enter User ID: ");
        String userID = sc.nextLine();
        System.out.print("Enter User Password: ");
        String userPassword=sc.nextLine();
        for (Bank_Account findCustomer:customers){
            if(findCustomer.getCUserID().equalsIgnoreCase(userID)&&findCustomer.getCUserPassword().equals(userPassword)) {
                System.out.print("Enter Amount: ");
                double amountAdded = sc.nextDouble();
                if (amountAdded < 0) {
                    System.out.println("Error: Must Enter a Positive Dollar Amount");
                    throw new NegativeDollarAmountException("Negative Dollar Amount");
                } else {
                    findCustomer.deposit_amount(amountAdded);
                }
            }
            else{
                System.out.println("Error: Must Enter a Valid User ID and Password");
                throw new CustomerAccountNotFoundException("Customer Account Not Found");
            }
        }
    }
    public static void withdrawal(ArrayList<Bank_Account>customers) throws NegativeDollarAmountException,InsufficientFundsException,CustomerAccountNotFoundException{
        sc.nextLine();
        System.out.print("Enter User ID: ");
        String userID = sc.nextLine();
        System.out.print("Enter User Password: ");
        String userPassword=sc.nextLine();
        for (Bank_Account findCustomer:customers){
            if(findCustomer.getCUserID().equalsIgnoreCase(userID)&&findCustomer.getCUserPassword().equals(userPassword)) {
                System.out.print("Enter Amount: ");
                double amountAdded = sc.nextDouble();
                if((findCustomer.getCAccountBalance()-amountAdded)<0){
                    System.out.println("Error: Must Withdraw an Amount Less Than Your Balance");
                    throw new InsufficientFundsException("Insufficient Funds");
                }
                if (amountAdded < 0) {
                    System.out.println("Error: Must Enter a Positive Dollar Amount");
                    throw new NegativeDollarAmountException("Error: Negative Dollar Amount");
                } else {
                    findCustomer.withdrawal_amount(amountAdded);
                }
            }
            else{
                System.out.println("Error: Must Enter a Valid User ID and Password");
                throw new CustomerAccountNotFoundException("Customer Account Not Found");
            }
        }
    }
    public static void account_balance(ArrayList<Bank_Account>customers)throws CustomerAccountNotFoundException{
        sc.nextLine();
        System.out.print("Enter User ID: ");
        String userID = sc.nextLine();
        System.out.print("Enter User Password: ");
        String userPassword=sc.nextLine();
        for (Bank_Account findCustomer:customers){
            if(findCustomer.getCUserID().equalsIgnoreCase(userID)&&findCustomer.getCUserPassword().equals(userPassword)) {
                System.out.println("Customer Name: "+findCustomer.getCFName());
                System.out.println("Account Number: "+findCustomer.getUniqueAccountId());
                System.out.println("Account Balance: "+findCustomer.getCAccountBalance());
                if(findCustomer.getClass()==Checking_Account.class) {
                    System.out.println("Account Type: Checking");
                    System.out.println("Account Daily Withdrawal Limit: "+((Checking_Account) findCustomer).getDailyWithdrawalLimit());
                }
            }
            else{
            System.out.println("Error: Must Enter a Valid User ID and Password");
            throw new CustomerAccountNotFoundException("Customer Account Not Found");
        }
        }

    }
    public static void main(String[] args)  {
        ArrayList<Bank_Account>customers=new ArrayList<>();
        int userChoice;
        String name;
        String userID;
        String password;
        int amountAdded;
        int amountDeducted;
        do{
            System.out.println("1 – Create An Account\n" +
                    "2 – Delete An Account\n" +
                    "3 – Make An Account Deposit\n" +
                    "4 – Make An Account Withdrawal\n" +
                    "5 – Check An Account Balance\n" +
                    "6 – Exit");
            System.out.print("Enter Choice:");
            userChoice=sc.nextInt();
        switch (userChoice){
            case 1:
                try {
                    createAccount(customers);
                }catch (Exception first){
                    System.out.println(first.toString().substring(9));
                }
                finally {
                    break;
                }
            case 2:
                try{
                    deleteAccount(customers);
                }catch(Exception second){
                    System.out.println(second.toString().substring(9));
                }
                finally {
                    break;
                }
            case 3:
                try{
                    deposit(customers);
                }catch (Exception third){
                    System.out.println(third.toString().substring(9));
                }
                finally {
                    break;
                }
            case 4:
                try{
                    withdrawal(customers);
                }catch(Exception forth){
                    System.out.println(forth.toString().substring(9));
                }
                finally{
                break;
                }
            case 5:
                try{
                    account_balance(customers);
                }catch(Exception five){
                    System.out.println(five.toString().substring(9));
                }
                finally {
                break;
            }
        }
        if(userChoice>6||userChoice<1){
            System.out.println("Error: Please enter a valid choice (1 thru 6)");
        }
        }while(userChoice!=6);
    }
}
