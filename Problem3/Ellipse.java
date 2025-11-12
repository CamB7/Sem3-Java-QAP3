package Problem3;

/**
 * Ellipse class
 * Extends Shape class to represent an ellipse with major and minor axes
 */
public class Ellipse extends Shape {
    protected double a; // major axis
    protected double b; // minor axis

    /**
     * Constructs a new ellipse with the specified name and axes.
     * @param name The name of the ellipse.
     * @param axis1 The first axis length.
     * @param axis2 The second axis length.
     */
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        // Ensure 'a' is larger and 'b' is smaller
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    /**
     * Gets the major axis length.
     * @return The major axis length.
     */
    public double getA() {
        return a;
    }

    /**
     * Gets the minor axis length.
     * @return The minor axis length.
     */
    public double getB() {
        return b;
    }

    /**
     * Calculates the area of the ellipse.
     * @return The area of the ellipse (π * a * b).
     */
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    /**
     * Calculates the perimeter of the ellipse using Ramanujan's approximation.
     * @return The approximate perimeter of the ellipse.
     */
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}