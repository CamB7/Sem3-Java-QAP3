package Problem1;

/**
 * Student class
 * Extends Person class to represent a student with ID number and GPA
 */
class Student extends Person {
    protected String myIdNum;    // Student Id Number
    protected double myGPA;      // grade point average
    
    /**
     * Constructs a new student with the specified details.
     * @param name     The name of the student.
     * @param age      The age of the student.
     * @param gender   The gender of the student.
     * @param idNum    The student ID number.
     * @param gpa      The grade point average of the student.
     */
    public Student(String name, int age, String gender, String idNum, double gpa)  {
    // use the super class' constructor
    super(name, age, gender);
    // initialize what's new to Student
    myIdNum = idNum;
    myGPA = gpa;
    }
    
    /**
     * Gets the student ID number.
     * @return The student ID number.
     */
    public String getIdNum() {
        return myIdNum;
    }

    /**
     * Sets the student ID number.
     * @param idNum The new student ID number.
     */
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    /**
     * Gets the grade point average.
     * @return The grade point average.
     */
    public double getGPA() {
        return myGPA;
    }

    /**
     * Sets the grade point average.
     * @param gpa The new grade point average.
     */
    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    /**
     * Returns a string representation of the student.
     * @return A string containing the student's information including ID number and GPA.
     */
    public String toString() {
        return super.toString() + ", IdNum: " + myIdNum + ", GPA: " + myGPA;
    }

}