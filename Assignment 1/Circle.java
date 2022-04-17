package RanasiaC;

public class Circle {
    private double radius;
    Circle(double rad){
        radius=rad;
    }
     double circumference(){
        return (2 * Math.PI * radius);
    }
    double area(){
        return (Math.PI*Math.pow(radius,2));
    }
}
