package Problem3;

/**
 * Circle class
 * Extends Ellipse class to represent a circle with a single radius
 */
public class Circle extends Ellipse {
    
    /**
     * Constructs a new circle with the specified name and radius.
     * @param name The name of the circle.
     * @param radius The radius of the circle.
     */
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    /**
     * Gets the radius of the circle.
     * @return The radius of the circle.
     */
    public double getRadius() {
        return a; // Since a = b = radius in a circle
    }
}