package Problem4;

/**
 * Shape class
 * Abstract base class for all geometric shapes
 */
public abstract class Shape {
    protected String name;

    /**
     * Constructs a new shape with the specified name.
     * @param name The name of the shape.
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Calculates the area of the shape.
     * @return The area of the shape.
     */
    public abstract double getArea();

    /**
     * Calculates the perimeter of the shape.
     * @return The perimeter of the shape.
     */
    public abstract double getPerimeter();

    /**
     * Returns a string representation of the shape.
     * @return A string containing the shape's name, area and perimeter.
     */
    @Override
    public String toString() {
        return String.format("%-25s Area = %8.3f   Perimeter = %8.3f",
            name, getArea(), getPerimeter());
    }
}