/**
 * The Square class is inherited from the class Shape
 * It is used to create Square and calculate its area and perimeter
 */
public class Square extends Shape{
    double s;
    public Square(double s){
        this.s = s;
    }
    @Override
    void area() {
        double area = s*s;
        System.out.println("The area is " + area);
    }
    @Override
    void perimeter(){
        double perimeter = s*4;
        System.out.println("The perimeter is " + perimeter);
    }
}
