package RanasiaC;

public class Main {

    public static void main(String[] args) {
	for(int i=1;i<=10;i++){
        Circle circle= new Circle(i);
        System.out.println("Area of a circle with radius "+i+" is "+circle.area()+ " circumference is "+circle.circumference());
    }
    for(int i=1;i<=3;i++){
        for(int j=1;j<=3;j++){
            Rectangle rectangle=new Rectangle(i,j);
            System.out.println("Area of a rectangle "+i+" by "+j+" is "+ rectangle.area()+" it's perimeter is "+rectangle.perimeter());
        }
    }
    Triangle triangle1=new Triangle(18,30,24);
    System.out.println("Area of a triangle 18x30x24 is "+triangle1.area()+" it's perimeter is "+ triangle1.perimeter()+" and it's height is "+triangle1.height());
    Triangle originalTriangle= new Triangle();
        System.out.println("Area of a triangle 3x4x5 is "+originalTriangle.area()+" it's perimeter is "+ originalTriangle.perimeter()+" and it's height is "+originalTriangle.height());

    }
}
