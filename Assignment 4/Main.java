package RanasiaC;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void addLoan(ArrayList<Loan>loans){
        int loanChoice;
        String customerName;
        double loanAmount;
        double interestRate;
        int numberOfMonthlyPayment;
        char studentDeferred;
        boolean isDeferred=false;
        double downPayment;
        System.out.println("Enter Loan Type (1 – Student, 2 – Auto):");
        loanChoice=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Customer Name:");
        customerName=sc.nextLine();
        System.out.println("Enter Loan Amount:");
        loanAmount=sc.nextDouble();
        System.out.println("Enter Interest Rate:");
        interestRate=sc.nextDouble();
        System.out.println("Enter Number of Monthly Payments:");
        numberOfMonthlyPayment=sc.nextInt();
        if(loanChoice==1) {
            System.out.println("Is Loan Deferred? (Y or N):");
            studentDeferred=sc.next().charAt(0);
            if(studentDeferred=='n'||studentDeferred=='N'){
                isDeferred=false;
            }
            else if(studentDeferred=='Y'||studentDeferred=='y'){
                isDeferred=true;
            }
            StudentLoan studentLoans=new StudentLoan(customerName,loanAmount,interestRate,numberOfMonthlyPayment,isDeferred);
            loans.add(studentLoans);
        }
        else if(loanChoice==2){
            System.out.println("Enter Amount of Down Payment:");
            downPayment=sc.nextDouble();
            AutoLoan autoLoans= new AutoLoan(customerName,loanAmount,interestRate,numberOfMonthlyPayment,downPayment);
            loans.add(autoLoans);
        }
    }
    public static void deleteLoan(ArrayList<Loan> loans){
        String customerName;
        sc.nextLine();
        System.out.print("Enter Customer Name:");
        customerName=sc.nextLine();
        for (Loan searchLoan: loans){
            String customersNames= searchLoan.getCustomerName();
            if(customerName.equalsIgnoreCase(customersNames)){
                loans.remove(searchLoan);
                searchLoan.decreaseNumberOfLoans();
                break;
            }
            else{
                continue;
            }
        }
    }
    public static void calculateMonthlyPayment(ArrayList<Loan> loans){
        for(Loan newLoans: loans){
            newLoans.calculateMonthlyPayment();
        }
    }
    public static void printLoans(ArrayList<Loan> loans){
        for(Loan printedLoans: loans){
            System.out.println(printedLoans.toString());
        }
    }
    public static void main(String[] args) {
        ArrayList<Loan> loans= new ArrayList<>();
        int userChoice;
        do{System.out.print("1 – Add Loan\n" +
                "2 – Delete Loan\n" +
                "3 – Calculate Monthly Payments\n" +
                "4 – Print Loans\n" +
                "5 – Exit\n" +
                "Enter Choice:");
        userChoice= sc.nextInt();
        switch (userChoice){
            case 1:
                addLoan(loans);
                break;
            case 2:
                deleteLoan(loans);
                break;
            case 3:
                calculateMonthlyPayment(loans);
                break;
            case 4:
                printLoans(loans);
                break;
        }
        if(userChoice>5||userChoice<1){
            System.out.println("Error: Please Enter Valid Input");
        }
    }while(userChoice!=5);
    }
}
