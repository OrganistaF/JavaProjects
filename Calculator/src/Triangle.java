/**
 * The Triangle class is inherited from the class Shape
 * It is used to create Triangle and calculate its area and perimeter
 * For area it is used the Herons formula, so it works for any triangle
 */
public class Triangle extends Shape{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c ){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    void area() {
        double s = (a + b+ c) / 2;
        double area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        System.out.println("The area is " + area);
    }

    @Override
    void perimeter(){
        double perimeter = a + b + c ;
        System.out.println("The perimeter is " + perimeter);

    }
}
