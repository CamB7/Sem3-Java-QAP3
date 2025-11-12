package Problem3;

/**
 * Triangle class
 * Extends Shape class to represent a triangle with three sides
 */
public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    /**
     * Constructs a new triangle with the specified name and side lengths.
     * Validates that the three sides can form a valid triangle.
     * @param name The name of the triangle.
     * @param side1 The length of the first side.
     * @param side2 The length of the second side.
     * @param side3 The length of the third side.
     */
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        
        // Check triangle inequality
        if (side1 + side2 <= side3 ||
            side2 + side3 <= side1 ||
            side3 + side1 <= side2) {
            System.out.println("Error: Invalid triangle side lengths.");
            System.exit(1);
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Gets the length of the first side.
     * @return The length of the first side.
     */
    public double getSide1() {
        return side1;
    }

    /**
     * Gets the length of the second side.
     * @return The length of the second side.
     */
    public double getSide2() {
        return side2;
    }

    /**
     * Gets the length of the third side.
     * @return The length of the third side.
     */
    public double getSide3() {
        return side3;
    }

    /**
     * Calculates the area of the triangle using Heron's formula.
     * @return The area of the triangle.
     */
    @Override
    public double getArea() {
        double semi = (side1 + side2 + side3) / 2.0; // semi-perimeter
        return Math.sqrt(semi * (semi - side1) * (semi - side2) * (semi - side3));
    }

    /**
     * Calculates the perimeter of the triangle.
     * @return The perimeter of the triangle.
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}