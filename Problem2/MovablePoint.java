package Problem2;

/**
 * MovablePoint class
 * Extends Point class to represent a movable point with speed in x and y directions
 */
public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    /**
     * Constructs a new movable point at the origin with zero speed.
     */
    public MovablePoint() {
    }

    /**
     * Constructs a new movable point at the origin with specified speeds.
     * @param xSpeed The speed in the x-direction.
     * @param ySpeed The speed in the y-direction.
     */
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Constructs a new movable point with specified coordinates and speeds.
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     * @param xSpeed The speed in the x-direction.
     * @param ySpeed The speed in the y-direction.
     */
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Gets the speed in the x-direction.
     * @return The speed in the x-direction.
     */
    public float getXSpeed() {
        return xSpeed;
    }

    /**
     * Sets the speed in the x-direction.
     * @param xSpeed The new speed in the x-direction.
     */
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    /**
     * Gets the speed in the y-direction.
     * @return The speed in the y-direction.
     */
    public float getYSpeed() {
        return ySpeed;
    }

    /**
     * Sets the speed in the y-direction.
     * @param ySpeed The new speed in the y-direction.
     */
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    /**
     * Sets both x and y speeds of the movable point.
     * @param xSpeed The new speed in the x-direction.
     * @param ySpeed The new speed in the y-direction.
     */
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    /**
     * Gets both x and y speeds as an array.
     * @return An array containing the x and y speeds.
     */
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    /**
     * Returns a string representation of the movable point.
     * @return A string containing the point's coordinates and speed values.
     */
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }

    /**
     * Moves the point by adding the speed values to the current coordinates.
     * @return The updated MovablePoint object after moving.
     */
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}