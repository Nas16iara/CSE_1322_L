package RanasiaC;

public class FibFormula implements FindFib{

    public int calculate_fib(int num) {
    int i;
    int fn1= (int) Math.pow((1+Math.sqrt(5.0)),num);
    int fn2= (int) Math.pow(1-Math.sqrt(5.0),num);
    int fn3= (int) (Math.pow(2,num)*Math.sqrt(5.0));
    int fn=(fn1-fn2)/fn3;
        return fn;
    }
}
