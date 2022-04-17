package RanasiaC;

public class Rectangle {
    private double height;
    private double width;
    Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    double perimeter(){
        return ((2*height)+(2*width));
    }
    double area(){
        return (width*height);
    }
}
