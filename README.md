# Sem3-Java-QAP3

---

## Project Structure

```
Sem3-Java-QAP3/
│
├── Problem1/
│   ├── Person.java
│   ├── Student.java
│   ├── Teacher.java
│   ├── CollegeStudent.java
│   ├── Demo.java
│
├── Problem2/
│   ├── Point.java
│   ├── MovablePoint.java
│   ├── Demo.java
│
├── Problem3/
│   ├── Shape.java
│   ├── Circle.java
│   ├── Ellipse.java
│   ├── Triangle.java
│   ├── EquilateralTriangle.java
│   ├── Demo.java
│
├── Problem4/
│   ├── Shape.java
│   ├── Circle.java
│   ├── Ellipse.java
│   ├── Triangle.java
│   ├── EquilateralTriangle.java
│   ├── Scalable.java
│   ├── Demo.java
│
└── README.md
```

---

## Problem Summaries

### Problem 1 — Inheritance (Person, Student, Teacher, CollegeStudent)

Implements a class hierarchy using inheritance:

* **Person**: Base class with name, age, and gender.
* **Student**: Extends Person with student ID and GPA.
* **Teacher**: Extends Person with subject and salary.
* **CollegeStudent**: Extends Student with year and major.

A `Demo.java` class tests all subclasses and prints their details using overridden `toString()` methods.

---

### Problem 2 — Class Relationships (Point and MovablePoint)

Implements a relationship between:

* **Point**: Represents a point in 2D space (x, y).
* **MovablePoint**: Extends Point by adding movement speed along both axes.

The demo file creates and moves points, showing method overriding and use of getters/setters for encapsulated data.

---

### Problem 3 — Abstract Classes (Shape Hierarchy)

Implements a hierarchy of geometric shapes:

* **Shape** (abstract): Base class with name, abstract `area()` and `perimeter()`.
* **Ellipse**, **Circle**, **Triangle**, **EquilateralTriangle**: Subclasses implementing area and perimeter calculations.

`Demo.java` creates an array of shapes, prints their name, area, and perimeter using a single overridden `toString()` in `Shape`.

---

### Problem 4 — Interfaces (Scalable Shapes)

Extends Problem 3 by introducing an interface:

* **Scalable**: Declares a method `scale(float factor)`.
* Shape subclasses implement `scale` to resize their dimensions by a scale factor.

`Demo.java` demonstrates scaling all shapes and prints before/after results.

---

## How to Run

1. Open a terminal or command prompt.
2. Navigate to the project directory:

   ```bash
   cd SEM3-JAVA-QAP3
   ```
3. Compile all Java files:

   ```bash
   javac */*.java
   ```
4. To view the output for each problem, run its corresponding demo file.

   Example for **Problem 1**:

   ```bash
   java Problem1.Demo
   ```

Each `Demo.java` file contains a `main()` method that showcases the functionality of its respective problem.

---
