package RanasiaC;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<InsurancePolicy> insurancePolicyArrayList= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        boolean metOutOfPocket;
        boolean metDeductible;
        int userChoice;
        String policyHolder;
        double deductibleLimit;
        double coPayment;
        double totalOutOfPocket;
        String beneficiary;
        int term;
        double termPayout;
        do {
            System.out.println("1 – Create Health Insurance Policy\n" +
                    "2 – Create Term-Life Insurance Policy\n" +
                    "3 – Exit");
            System.out.print("Enter Choice: ");
            userChoice=sc.nextInt();
            if(userChoice<1||userChoice>3){
                System.out.println("Error:Please enter valid input");
            }
            else if(userChoice==1){
                sc.nextLine();
                System.out.println("Enter name of policy holder:");
                policyHolder=sc.nextLine();
                System.out.println("Enter deductible amount:");
                deductibleLimit=sc.nextDouble();
                System.out.println("Enter co-payment amount:");
                coPayment=sc.nextDouble();
                System.out.println("Enter total out-of-payment:");
                totalOutOfPocket=sc.nextDouble();
                HealthInsurancePolicy newHealthInsurancePolicy = new HealthInsurancePolicy(policyHolder,deductibleLimit,coPayment,totalOutOfPocket);
                metOutOfPocket=newHealthInsurancePolicy.hasMetOutOfPocket();
                metDeductible=newHealthInsurancePolicy.hasMetDeductible();
                insurancePolicyArrayList.add(newHealthInsurancePolicy);
            }
            else if(userChoice==2){
                sc.nextLine();
                System.out.println("Enter name of policy holder:");
                policyHolder=sc.nextLine();
                System.out.println("Enter name of beneficiary:");
                beneficiary=sc.nextLine();
                System.out.println("Enter number of years in term:");
                term=sc.nextInt();
                System.out.println("Enter amount of payout:");
                termPayout= sc.nextDouble();
                TermLifeInsurancePolicy newLifeInsurance= new TermLifeInsurancePolicy(policyHolder,beneficiary,term,termPayout);
                insurancePolicyArrayList.add(newLifeInsurance);
            }
        }while(userChoice!=3);
        for(InsurancePolicy printingInsurancePolicy:insurancePolicyArrayList){
            System.out.println(printingInsurancePolicy.toString1());
        }
    }
}
