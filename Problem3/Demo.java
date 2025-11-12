package Problem3;

/**
 * Demo class
 * Testing class to demonstrate polymorphism with Shape hierarchy using an array
 */
public class Demo {
    /**
     * Main method to test all shape classes using polymorphism with Shape array.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        System.out.println("** Displaying Shape Information **\n");

        // Create array of Shape objects
        Shape[] shapes = {
            new Ellipse("MyEllipse", 6.0, 3.0),
            new Circle("MyCircle", 5.0),
            new Triangle("MyTriangle", 3.0, 4.0, 5.0),
            new EquilateralTriangle("MyEquilateralTriangle", 4.0)
        };

        // Loop through array and print each shape's information
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}