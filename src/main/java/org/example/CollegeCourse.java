package org.example;

    public class CollegeCourse {
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


