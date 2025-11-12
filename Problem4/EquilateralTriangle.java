package Problem4;

public class EquilateralTriangle extends Triangle {
    /**
     * Constructs a new equilateral triangle with the specified name and side length.
     * @param name The name of the equilateral triangle.
     * @param side The length of each side.
     */
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);
    }
}
