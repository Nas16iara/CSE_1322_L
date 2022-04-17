package RanasiaC;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int userChoice;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number you want to find the Fibonacci Series for:");
    userChoice=sc.nextInt();
    FibFormula myFibForm=new FibFormula();
    FibIteration myFibIter= new FibIteration();
    System.out.println("Fib of "+userChoice+" by iteration is:"+ myFibIter.calculate_fib(userChoice));
    System.out.println("Fib of "+userChoice+" by formula is:"+ myFibForm.calculate_fib(userChoice));

    }
}
