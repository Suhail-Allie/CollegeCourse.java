package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//CollegeCourse
         class CollegeCourse {
            private String courseID;
            private int creditHours;
            private char letterGrade;

            // Constructor
            public CollegeCourse(String courseID, int creditHours, char letterGrade) {
                this.courseID = courseID;
                this.creditHours = creditHours;
                this.letterGrade = letterGrade;
            }

            // Getter for courseID
            public String getCourseID() {
                return courseID;
            }

            // Setter for courseID
            public void setCourseID(String courseID) {
                this.courseID = courseID;
            }

            // Getter for creditHours
            public int getCreditHours() {
                return creditHours;
            }

            // Setter for creditHours
            public void setCreditHours(int creditHours) {
                this.creditHours = creditHours;
            }

            // Getter for letterGrade
            public char getLetterGrade() {
                return letterGrade;
            }

            // Setter for letterGrade
            public void setLetterGrade(char letterGrade) {
                this.letterGrade = letterGrade;
            }

            // Method to display course details
            @Override
            public String toString() {
                return "Course ID: " + courseID + ", Credit Hours: " + creditHours + ", Letter Grade: " + letterGrade;
            }
        }

        //Student
         class Student {
            private int studentID;
            private org.example.CollegeCourse[] courses;

            // Constructor to initialize Student with an ID and empty courses array
            public Student(int studentID) {
                this.studentID = studentID;
                this.courses = new org.example.CollegeCourse[5];
            }

            // Getter for studentID
            public int getStudentID() {
                return studentID;
            }

            // Setter for studentID
            public void setStudentID(int studentID) {
                this.studentID = studentID;
            }

            // Getter for a specific CollegeCourse
            public org.example.CollegeCourse getCourse(int index) {
                if (index >= 0 && index < courses.length) {
                    return courses[index];
                } else {
                    throw new IndexOutOfBoundsException("Invalid course index.");
                }
            }

            // Setter for a specific CollegeCourse
            public void setCourse(org.example.CollegeCourse course, int index) {
                if (index >= 0 && index < courses.length) {
                    courses[index] = course;
                } else {
                    throw new IndexOutOfBoundsException("Invalid course index.");
                }
            }
        }

        //InputGrades
         class InputGrades {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                org.example.Student[] students = new org.example.Student[10]; // Array to hold 10 Student objects

                // Initialize Student objects
                for (int i = 0; i < students.length; i++) {
                    students[i] = new org.example.Student(i + 1);
                }

                // Collect data for each student
                for (int i = 0; i < students.length; i++) {
                    System.out.println("Entering data for student #" + (i + 1));
                    System.out.print("Enter student ID: ");
                    int studentID = input.nextInt();
                    input.nextLine(); // Consume newline

                    // Set the student ID
                    students[i].setStudentID(studentID);

                    // Collect course data
                    for (int j = 0; j < 5; j++) {
                        System.out.print("Enter course ID #" + (j + 1) + ": ");
                        String courseID = input.nextLine();

                        // Collect grade and validate
                        String grade;
                        do {
                            System.out.print("Enter grade for course #" + (j + 1) + " (A, B, C, D, F): ");
                            grade = input.nextLine().toUpperCase();
                        } while (!isValidGrade(grade));

                        // Create CollegeCourse object and set it
                        org.example.CollegeCourse course = new org.example.CollegeCourse(courseID, 3, grade.charAt(0)); // Assuming credit hours are 3
                        students[i].setCourse(course, j);
                    }
                }

                // Display all students and their courses
                for (org.example.Student student : students) {
                    System.out.println("\nStudent ID: " + student.getStudentID());
                    for (int k = 0; k < 5; k++) {
                        org.example.CollegeCourse course = student.getCourse(k);
                        System.out.println("Course ID: " + course.getCourseID() + ", Grade: " + course.getLetterGrade());
                    }
                }

                input.close();
            }

            // Method to check if the grade is valid
            private static boolean isValidGrade(String grade) {
                return grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F");
            }
        }

    }
}