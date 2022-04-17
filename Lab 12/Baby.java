package RanasiaC;
import java.util.Random;
public class Baby implements Runnable{
    //Objects:
    Random random=new Random();
    //Attributes:
    private int time;
    private String name;
    //Constructors:
    Baby(String userName){
        name=userName;
        time=random.nextInt(5000);
    }
    //Methods:
    @Override
    public void run(){
        System.out.println("My name is "+name+" I am going to sleep for "+time+"ms");
        try {
            Thread.sleep(time);
        }
        catch(InterruptedException interruptedException){
                  System.out.println(interruptedException.getStackTrace());
        }
        System.out.println("My name is "+name+", I am awake,feed me!!!");
    }
}
