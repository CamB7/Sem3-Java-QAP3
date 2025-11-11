package Problem2;

/**
 * Point class
 * Represents a point in 2D space with x and y coordinates
 */
public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    /**
     * Constructs a new point at the origin (0, 0).
     */
    public Point() {
    }

    /**
     * Constructs a new point with the specified coordinates.
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     */
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate of the point.
     * @return The x-coordinate of the point.
     */
    public float getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the point.
     * @param x The new x-coordinate of the point.
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Gets the y-coordinate of the point.
     * @return The y-coordinate of the point.
     */
    public float getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the point.
     * @param y The new y-coordinate of the point.
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Sets both x and y coordinates of the point.
     * @param x The new x-coordinate of the point.
     * @param y The new y-coordinate of the point.
     */
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets both x and y coordinates as an array.
     * @return An array containing the x and y coordinates.
     */
    public float[] getXY() {
        return new float[]{x, y};
    }

    /**
     * Returns a string representation of the point.
     * @return A string containing the point's coordinates in format (x, y).
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}