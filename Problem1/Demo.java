package Problem1;

/**
 * Demo class
 * Testing class to demonstrate the functionality of Person, Student, Teacher, and CollegeStudent classes
 */
public class Demo {
    /**
     * Main method to test all classes and their toString methods.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create and display Person object
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);
        
        // Create and display Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);
        
        // Create and display Teacher object
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);
        
        // Create and display CollegeStudent object
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}