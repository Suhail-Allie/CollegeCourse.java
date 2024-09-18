package org.example;
import java.util.Scanner;

    public class InputGrades {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Student[] students = new Student[10]; // Array to hold 10 Student objects

            // Initialize Student objects
            for (int i = 0; i < students.length; i++) {
                students[i] = new Student(i + 1);
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
                    CollegeCourse course = new CollegeCourse(courseID, 3, grade.charAt(0)); // Assuming credit hours are 3
                    students[i].setCourse(course, j);
                }
            }

            // Display all students and their courses
            for (Student student : students) {
                System.out.println("\nStudent ID: " + student.getStudentID());
                for (int k = 0; k < 5; k++) {
                    CollegeCourse course = student.getCourse(k);
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


