package org.example;

    public class Student {
        private int studentID;
        private CollegeCourse[] courses;

        // Constructor to initialize Student with an ID and empty courses array
        public Student(int studentID) {
            this.studentID = studentID;
            this.courses = new CollegeCourse[5];
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
        public CollegeCourse getCourse(int index) {
            if (index >= 0 && index < courses.length) {
                return courses[index];
            } else {
                throw new IndexOutOfBoundsException("Invalid course index.");
            }
        }

        // Setter for a specific CollegeCourse
        public void setCourse(CollegeCourse course, int index) {
            if (index >= 0 && index < courses.length) {
                courses[index] = course;
            } else {
                throw new IndexOutOfBoundsException("Invalid course index.");
            }
        }
    }


