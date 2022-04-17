package RanasiaC;

public class Triangle {
    //Attributes:
    private double side1;
    private double side2;
    private double side3;
    //Constructors:
    Triangle(double side1Trig,double side2Trig,double side3Trig){
        side1=side1Trig;
        side2=side2Trig;
        side3=side3Trig;
    }
    Triangle(){
        side1=3;
        side2=4;
        side3=5;
    }
    //Methods:
    double perimeter(){
        double perimeterTrig=(side1+side2+side3);
        return perimeterTrig;
    }
    double area(){
        double p=perimeter()/2;
        double areaTrig=(Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)));
        return areaTrig;
    }
    double height(){
        double smallest;
        if(side2<side1 && side2<side3){
            smallest=side2;
        }
        else if(side1<side2 && side1<side3){
            smallest=side1;
        }
        else{
            smallest=side3;
        }
        double heigthTrig=(area()*2)/smallest;
        return heightTrig;
    }
    public String toString() {
        return "Triangle has" + "sides " + side1 + "," + side2 + " and " + side3 + "."+
                " It has an area of "+area() +" and perimeter of "+perimeter();

    }
}
