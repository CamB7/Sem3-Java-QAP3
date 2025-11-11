package Problem2;

/**
 * Demo class
 * Testing class to demonstrate the functionality of Point and MovablePoint classes
 */
public class Demo {
    /**
     * Main method to test MovablePoint class and its move functionality.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a MovablePoint
        MovablePoint mp1 = new MovablePoint(1.5f, 2.5f, 0.5f, 1.0f);
        System.out.println("\n** mp1 **");
        System.out.println("Before move: " + mp1);

        // Move it once
        mp1.move();
        System.out.println("After move 1: " + mp1);

        // Move it again
        mp1.move();
        System.out.println("After move 2: " + mp1);

        // Create a MovablePoint using default constructor
        MovablePoint mp2 = new MovablePoint();
        mp2.setXY(3.0f, 4.0f);
        mp2.setSpeed(1.0f, 1.0f);
        System.out.println("\n** mp2 **");
        System.out.println("Before move: " + mp2);
        mp2.move();
        System.out.println("After move: " + mp2);
    }
}