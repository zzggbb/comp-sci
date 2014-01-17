/*
    Name: Zane Bradley
    File: BackToSchoolTester.java
    Purpose: Demonstrate the CollegeStudent, Teacher and Student classes by
             instantiating lists of them and printing their information.
*/

import java.util.ArrayList;

public class BackToSchoolTester {
    public static void main(String[] args) {

        // initialize empty lists of Person, Teachers and CollegeStudents
        Person testPerson = new Person();
        ArrayList <Teacher> teachers= new ArrayList <Teacher> (3);
        ArrayList <CollegeStudent> collegeStudents= new ArrayList <CollegeStudent> (3);

        System.out.println("PART 1: LIST CREATION");
        System.out.println();

        // creating and displaying list of Student(s)
        Student[] testStudents = {
                            new Student("Ada", 15, "F", "4242", 3.70),
                            new Student("Bob", 16, "M", "1234", 3.30),
                            new Student("Cam", 17, "F", "9876", 3.58)
        };
        System.out.println("List of Students: ");
        for (Student i : testStudents){
            System.out.println(i);
        }
        System.out.println();

        // creating and displaying list of Teacher(s)
        teachers.add(new Teacher("Tom", 38, "M", "English", 34000));
        teachers.add(new Teacher("Fran", 67, "F", "Algebra", 45000));
        teachers.add(new Teacher("Stan", 27, "M", "Chemistry", 34680));
        System.out.println("List of Teachers: ");
        for (Teacher i : teachers){
            System.out.println(i);
        }
        System.out.println();

        // creating and displaying list of CollegeStudent(s)
        collegeStudents.add(new CollegeStudent("Hans", 21, "M", "3845", 3.86, "Engineering", 3));
        collegeStudents.add(new CollegeStudent("Franz", 20, "M", "8567", 2.01, "Partying", 2));
        collegeStudents.add(new CollegeStudent("Claire", 19, "F", "6189", 4.0, "Marketing", 1));
        System.out.println("List of College Students: ");
        for (CollegeStudent i : collegeStudents){
            System.out.println(i);
        }
        System.out.println();

        System.out.println("PART 2 : LIST QUERIES");
        System.out.println();

        System.out.println("Subject of Teacher @ index 1 is " + teachers.get(1).getSubject());
        System.out.println();

        // print names of college students who are at least a sophomore
        for (CollegeStudent i : collegeStudents) {
            if (i.getYear() >= 2)
                System.out.println(i.getName()+" is at least a sophomore in college");
        }
        System.out.println();

        // print names of students who are alphabetically after "Ben"
        for (Student i : testStudents) {
            if (i.getName().compareTo("Ben") > 0)
                System.out.println(i.getName()+" is a student name that is " +
                    " alphabetically after Ben");
        }
    }
}