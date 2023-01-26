/**
 * The pentagram class is inherited from the class Shape
 * It is used to create Pentagrams and calculate its area and perimeter
 */
public class Pentagram extends Shape{

    double d;

    public Pentagram(double d){
        this.d = d;
    }
    @Override
    void area() {
        double c = 1.618 * d;
        double b = 1.618 * c;
        double a = 1.618 * b;
        double s = (a + b+ c) / 2;
        double aTriangle = Math.sqrt(s*(s - a)*(s - b)*(s - c));
        double aPentagon = ((d*5)*(Math.tan(54) * d/2))/2 ;
        double area = aTriangle*5 + aPentagon;
        System.out.println("The area is " + area);
    }
    @Override
    void perimeter(){
        double c = 1.618 * d;
        double perimeter = c * 10;
        System.out.println("The perimeter is " + perimeter);
    }
}
