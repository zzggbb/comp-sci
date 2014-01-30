/*
    Name: Zane Bradley
    File: CollegeStudent.java
    Purpose: Create a derived class of Student, with additional methods for
             major and year of college.
*/

public class CollegeStudent extends Student {

    // instance variables
    private String myMajor;
    private int myYear;

    // constructors
    public CollegeStudent(String name, int age, String gender,
                          String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }
    public CollegeStudent() {
        super();
        myMajor = "";
        myYear = 1;
    }

    // getters and setters
    public String getMajor() { return myMajor; }
    public int getYear()     { return myYear; }
    public void setMajor(String major) { myMajor = major; }
    public void setYear(int year)      { myYear = year; }

    // toString implementation: A CollegeStudent prints everything that a
    // Student does, while including major and year
    public String toString() {
        return super.toString()+", major: "+myMajor+", year: "+myYear;
    }
}