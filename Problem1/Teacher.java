package Problem1;

/**
 * Teacher class
 * Extends Person class to represent a teacher with subject and salary
 */
class Teacher extends Person {
    protected String mySubject;  // subject taught by the teacher
    protected double mySalary;   // annual salary of the teacher

    /**
     * Constructs a new teacher with the specified details.
     * @param name     The name of the teacher.
     * @param age      The age of the teacher.
     * @param gender   The gender of the teacher.
     * @param subject  The subject taught by the teacher.
     * @param salary   The annual salary of the teacher.
     */
    public Teacher(String name, int age, String gender, String subject, double salary) {
        // use the super class' constructor
        super(name, age, gender);
        // initialize what's new to Teacher
        mySubject = subject;
        mySalary = salary;
    }

    /**
     * Gets the subject taught by the teacher.
     * @return The subject taught by the teacher.
     */
    public String getSubject() {
        return mySubject;
    }

    /**
     * Sets the subject taught by the teacher.
     * @param subject The new subject to be taught by the teacher.
     */
    public void setSubject(String subject) {
        mySubject = subject;
    }

    /**
     * Gets the annual salary of the teacher.
     * @return The annual salary of the teacher.
     */
    public double getSalary() {
        return mySalary;
    }

    /**
     * Sets the annual salary of the teacher.
     * @param salary The new annual salary of the teacher.
     */
    public void setSalary(double salary) {
        mySalary = salary;
    }

    /**
     * Returns a string representation of the teacher.
     * @return A string containing the teacher's information including subject and salary.
     */
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
    }
}