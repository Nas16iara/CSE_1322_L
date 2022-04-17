package RanasiaC;

public class Faculty extends Employee {
    private double weeklySalary;
    private double weeklyStipend;
    private double weeklyPay;
    //constructor
    Faculty(String employeeName,double newWeeklySalary,double newWeeklyStipend){
        new Employee(employeeName);
        weeklySalary=newWeeklySalary;
        weeklyStipend= newWeeklyStipend;
        setEmployeeFullName(employeeName);
    }
    //getters and setters
    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary=weeklySalary;
    }
    public double getWeeklySalary(){
        return weeklySalary;
    }
    public void setWeeklyStipend(double weeklyStipend){
        this.weeklyStipend=weeklyStipend;
    }
    public double getWeeklyStipend() {
        return weeklyStipend;
    }
    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }
    public double getWeeklyPay() {
        return weeklyPay;
    }
    //methods
    void calculateWeeklyPay(){
        weeklyPay =weeklyStipend+weeklySalary;
    }

    @Override
    public String toString() {
        String s= "Name: "+ getEmployeeFullName() +
                ", Salary: "+getWeeklySalary()+
                ", Stipend: "+getWeeklyStipend()+
                ", Weekly Pay: "+ getWeeklyPay();
        return s;
    }
}