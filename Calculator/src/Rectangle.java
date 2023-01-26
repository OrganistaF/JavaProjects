/**
 * The Rectangle class is inherited from the class Shape
 * It is used to create Rectangle and calculate its area and perimeter
 */
public class Rectangle extends Shape {

    double w;
    double h;
    public Rectangle(double w, double h){
        this.h = h;
        this.w = w;
    }
    @Override
    void area() {
        double area = w*h;
        System.out.println("The area is " + area);
    }
    @Override
    void perimeter(){
        double perimeter = (w*2) + (h*2);
        System.out.println("The perimeter is " + perimeter);
    }
}
