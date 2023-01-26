/**
 * The Circle class is inherited from the class Shape
 * It is used to create Circle and calculate its area and perimeter
 */
public class Circle extends Shape{
    double r;
    public Circle(double r){
        this.r = r;
    }

    @Override
    void area() {
        double area = Math.PI * (r*r);
        System.out.println("The area is " + area);
    }
    @Override
    void perimeter(){
        double perimeter = Math.PI * (r*2) ;
        System.out.println("The perimeter is " + perimeter);
    }

}
