package RanasiaC;

public class FibIteration implements FindFib{
    public int calculate_fib(int number) {
    int num1=1;
    int num2=1;
    int num=1;
    for(int i=1;i<=number-2;i++){
        if(number==1||number==2){
            num=1;
            break;
        }
        else{
            num=(num1+num2);
            num2=num1;
            num1=num;
        }
        System.out.print(num+",");
    }
        System.out.println();
        return num;
    }
}
