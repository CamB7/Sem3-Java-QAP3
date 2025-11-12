package Problem4;

/**
 * Demo class
 * Testing class to demonstrate polymorphism with Shape hierarchy and Scalable interface
 */
public class Demo {
    /**
     * Main method to test all shape classes using polymorphism and scaling functionality.
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

        // Display original shapes
        System.out.println("Original shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        System.out.println("\nAfter scaling by factor of 2.0:");
        
        // Scale all shapes and display
        for (Shape shape : shapes) {
            if (shape instanceof Scalable) {
                ((Scalable) shape).scale(2.0);
            }
            System.out.println(shape.toString());
        }
    }
}