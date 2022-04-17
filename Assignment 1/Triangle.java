package RanasiaC;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    Triangle(double side1,double side2,double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    Triangle(){
        side1=3;
        side2=4;
        side3=5;
    }
    double perimeter(){
        return (side1+side2+side3);
    }
    double area(){
        double p=perimeter()/2;
        return (Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)));
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
        return (area()*2)/smallest;
    }
    public String toString() {
        return "Triangle has" + "sides " + side1 + "," + side2 + " and " + side3 + "."+
                " It has an area of "+area() +" and perimeter of "+perimeter();

    }
}
