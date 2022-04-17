package RanasiaC;

public class Circle {
    //Attributes:
    private double radius;
    //Constructors:
    Circle(double rad){
        radius=rad;
    }
    //Methods:
     double circumference(){
        double circumferenceCircle=(2 * Math.PI * radius);
        return circumferenceCircle;
    }
    double area(){
        double areaCircle=Math.PI*Math.pow(radius,2));
        return areaCircle;
    }
}
