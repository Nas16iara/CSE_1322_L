package RanasiaC;

public class Main {

    public static void main(String[] args) {
	Thread baby1=new Thread(new Baby("Noah"));
    Thread baby2=new Thread(new Baby("Oliva"));
    Thread baby3=new Thread(new Baby("Liam"));
    Thread baby4=new Thread(new Baby("Emma"));
    Thread baby5=new Thread(new Baby("Amelia"));

    baby1.start();
    baby2.start();
    baby3.start();
    baby4.start();
    baby5.start();
    }
}
