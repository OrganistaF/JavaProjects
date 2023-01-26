import java.util.Scanner;

/**
 * Menu class contains all instantiates of the different shapes as needed
 * It works until you select exit
 */
public class Menu {
    void startMenu() {
        /**
         * A loop is used to generate a menu for the calculator
         */
        boolean menu = true;
        while(menu) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Calculator! \n");
            System.out.println("Select the shape you want \n" +
                    "Enter 1 for Square, \n" +
                    "Enter 2 for Rectangle, \n" +
                    "Enter 3 for Triangle, \n" +
                    "Enter 4 for Circle, \n" +
                    "Enter 5 for Semicircle \n" +
                    "Enter 6 for Pentagon \n" +
                    "Enter 7 for Pentagram \n" +
                    "Enter 0 to exit \n");
            /**
             * In each case, the object is created, and it asks the user
             * their respective values tu calculate the area and perimeter
             * The values are read with Java Scanner
             * The Shape methods are executed to get the area and perimeter
             */
            switch (scanner.nextInt()) {
                case 0:
                    menu = false;
                    break;

                case 1:
                    System.out.println("Enter the length of the square side");
                    int l = scanner.nextInt();
                    Square square = new Square(l);
                    square.area();
                    square.perimeter();
                    break;

                case 2:
                    System.out.println("Enter the height of the rectangle side");
                    int h = scanner.nextInt();
                    System.out.println("Enter the Width of the rectangle side");
                    int w = scanner.nextInt();
                    Rectangle rectangle = new Rectangle(h, w);
                    rectangle.area();
                    rectangle.perimeter();
                    break;

                case 3:
                    System.out.println("Enter the length of the first triangle side");
                    int a = scanner.nextInt();
                    System.out.println("Enter the length of the second triangle side");
                    int b = scanner.nextInt();
                    System.out.println("Enter the length of the third triangle side");
                    int c = scanner.nextInt();
                    Triangle triangle = new Triangle(a, b, c);
                    triangle.area();
                    triangle.perimeter();
                    break;

                case 4:
                    System.out.println("Enter the radius of the circle");
                    int r = scanner.nextInt();
                    Circle circle = new Circle(r);
                    circle.area();
                    circle.perimeter();
                    break;

                case 5:
                    System.out.println("Enter the radius of the Semicircle");
                    int rad = scanner.nextInt();
                    SemiCircle semiCircle = new SemiCircle(rad);
                    semiCircle.area();
                    semiCircle.perimeter();
                    break;

                case 6:
                    System.out.println("Enter the length of the apothem");
                    int ap = scanner.nextInt();
                    System.out.println("Enter the length of one side of the pentagon");
                    int side = scanner.nextInt();
                    Pentagon pentagon = new Pentagon(ap, side);
                    pentagon.area();
                    pentagon.perimeter();
                    break;

                case 7:
                    System.out.println("Enter the length of the base of one triangle from the pentagram");
                    int d = scanner.nextInt();
                    Pentagram pentagram = new Pentagram(d);
                    pentagram.area();
                    pentagram.perimeter();
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + scanner.nextInt() + "It must be a valid number");
            }
        }
    }
}
