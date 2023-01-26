/**
 * The SemiCircle class is inherited from the class Shape
 * It is used to create SemiCircle and calculate its area and perimeter
 */
public class SemiCircle extends Shape{

    double r;
    public SemiCircle(double r){
        this.r = r;
    }

    @Override
    void area() {
        double area = (Math.PI * (Math.pow(r, 2)) /2);
        System.out.println("The area is " + area);
    }
    @Override
    void perimeter(){
        double perimeter = ((Math.PI * (r*2)) /2) + (r*2) ;
        System.out.println("The perimeter is " + perimeter);
    }

}
