package Problem1;

/**
 * Person class
 * Used as superclass for Student, CollegeStudent, and Teacher
 */

class Person {
    protected String myName ;   // name of the person
    protected int myAge;        // person's age
    protected String myGender;  // “M” for male, “F” for female

    /**
     * Constructs a new person with the specified details.
     * @param name     The name of the person.
     * @param age      The age of the person.
     * @param gender   The gender of the person.
     */
    public Person(String name, int age, String gender)  {
    myName = name;
    myAge = age;
    myGender = gender;
    }

    /**
     * Gets the name of the person.
     * @return
     */
    public String getName() {
        return myName;
    }

    /**
     * Sets the name of the person.
     * @param name The new name of the person.
     */
    public void setName(String name) {
        myName = name;
    }

    /**
     * Gets the age of the person.
     * @return
     */
    public int getAge() {
        return myAge;
    }

    /**
     * Sets the age of the person.
     * @param age The new age of the person.
     */
    public void setAge(int age) {
        myAge = age;
    }

    /**
     * Gets the gender of the person.
     * @return
     */
    public String getGender() {
        return myGender;
    }

    /**
     * Sets the gender of the person.
     * @param gender The new gender of the person.
     */
    public void setGender(String gender) {
        myGender = gender;
    }
    
    /**
     * Returns a string representation of the person.
     * @return A string containing the person's details.
     */
    public String toString()  {
    return myName + ", age: " + myAge + ", gender: " +myGender;
    }
}
    