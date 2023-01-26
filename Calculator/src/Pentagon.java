/**
 * The Pentagon class is inherited from the class Shape
 * It is used to create Pentagon and calculate its area and perimeter
 */
public class Pentagon extends Shape{
    double a;
    double s;

    public Pentagon(double a,  double s){
        this.a = a;
        this.s = s;
    }

    @Override
    void area() {
        double area = (5/2) * s * a;
        System.out.println("The area is " + area);
    }

    @Override
    void perimeter(){
        double perimeter = s * 5;
        System.out.println("The perimeter is " + perimeter);

    }
}
