package Problem1;

/**
 * CollegeStudent class
 * Extends Student class to represent a college student with major and year
 */
class CollegeStudent extends Student {
    protected String myMajor;  // major field of study
    protected int myYear;      // year in college (1=FROSH, 2=SOPH, etc.)

    /**
     * Constructs a new college student with the specified details.
     * @param name     The name of the college student.
     * @param age      The age of the college student.
     * @param gender   The gender of the college student.
     * @param idNum    The student ID number.
     * @param gpa      The grade point average of the college student.
     * @param year     The year in college (1=FROSH, 2=SOPH, etc.).
     * @param major    The major field of study.
     */
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        // use the super class' constructor
        super(name, age, gender, idNum, gpa);
        // initialize what's new to CollegeStudent
        myYear = year;
        myMajor = major;
    }

    /**
     * Gets the year in college.
     * @return The year in college.
     */
    public int getYear() {
        return myYear;
    }

    /**
     * Sets the year in college.
     * @param year The new year in college.
     */
    public void setYear(int year) {
        myYear = year;
    }

    /**
     * Gets the major field of study.
     * @return The major field of study.
     */
    public String getMajor() {
        return myMajor;
    }

    /**
     * Sets the major field of study.
     * @param major The new major field of study.
     */
    public void setMajor(String major) {
        myMajor = major;
    }

    /**
     * Returns a string representation of the college student.
     * @return A string containing the college student's information including year and major.
     */
    public String toString() {
        return super.toString() + ", year: " + myYear + ", major: " + myMajor;
    }
}