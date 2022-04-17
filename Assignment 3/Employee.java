
package RanasiaC;

public class Employee {
    private String employeeFullName;
    private int employeeId;
    private  int numberOfEmployees;
    private static int nextNumberOfEmployees=0;
    //constructors
    Employee(){
        this.employeeFullName="new employee";
        numberOfEmployees=nextNumberOfEmployees;
        nextNumberOfEmployees++;
    }
    Employee(String employeeFullName){
        this.employeeFullName=employeeFullName;
        numberOfEmployees=nextNumberOfEmployees;

    }
    //getter and setters
    public void setEmployeeFullName(String employeeFullName) {
        this.employeeFullName = employeeFullName;
    }

    public String getEmployeeFullName() {
        return employeeFullName;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    //methods
    static int getNextNumberOfEmployees(){
        return nextNumberOfEmployees;
    }
    static void decreaseNumberOfEmployees(){
        nextNumberOfEmployees--;
    }
}
