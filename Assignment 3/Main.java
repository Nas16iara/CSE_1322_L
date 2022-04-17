package RanasiaC;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void addFaculty(ArrayList<Faculty>faculties){
        String employeeName;
        double weeklyStipend;
        double weeklySalary;
        sc.nextLine();
        System.out.println("Enter Employee Name:");
        employeeName=sc.nextLine();
        System.out.println("Enter Weekly Salary:");
        weeklySalary=sc.nextDouble();
        System.out.println("Enter Weekly Stipend:");
        weeklyStipend=sc.nextDouble();
        Faculty newFaculty=new Faculty(employeeName,weeklySalary,weeklyStipend);
        faculties.add(newFaculty.getEmployeeId(),newFaculty);
    }
    public static void removeFaculty(ArrayList<Faculty>faculties){
        String employeeName;
        sc.nextLine();
        System.out.println("Enter Employee Name:");
        employeeName=sc.nextLine();
        for (Faculty faculty:faculties) {
            String testName=faculty.getEmployeeFullName();
            if(employeeName.equalsIgnoreCase(testName)){
                faculties.remove(faculty);
                Employee.decreaseNumberOfEmployees();
                break;
            }
        }
    }
    public static void calculateFacultyPay(ArrayList<Faculty>faculties){
        for (Faculty faculty:faculties) {
            faculty.calculateWeeklyPay();
        }
    }
    public static void printFaculty(ArrayList<Faculty> faculties){
        for (Faculty faculty:faculties) {
            System.out.println(faculty.toString());
        }
    }
    public static void main(String[] args) {
        ArrayList<Faculty> faculties = new ArrayList<>();
        int userChoice;
        do{
            System.out.println("1 – Add Faculty\n" +
                    "2 – Delete Faculty\n" +
                    "3 – Calculate Faculty Pay\n" +
                    "4 – Print Faculty\n" +
                    "5 – Exit");
            System.out.print("Enter Choice: ");
            userChoice= sc.nextInt();
            if(userChoice>5||userChoice<1){
                System.out.println("Error: Please enter valid input.");
                continue;
            }
            switch (userChoice){
                case 1:
                    addFaculty(faculties);
                    break;
                case 2:
                    removeFaculty(faculties);
                    break;
                case 3:
                    calculateFacultyPay(faculties);
                    break;
                case 4:
                    printFaculty(faculties);
            }
        }while(userChoice!=5);
    }
}
