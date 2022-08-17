package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        class Student{
            int numberOfCredits =1;
            double GPA =4.0;
        }

        public class Course{
            private String topic;
            private Teacher instructor;
            private ArrayList<Student> enrolledStudents;
        }
    }
}
