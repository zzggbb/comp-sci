/*
    Name: Zane Bradley
    File: Teacher.java
    Purpose: Create a derived-class of Person, Teacher, with additional methods for
             salary and subject.
*/

public class Teacher extends Person {

    // instance variables
    private String mySubject;
	private double mySalary;

    // constructors
	public Teacher(String name, int age, String gender, String subject, double salary) {
		super(name, age, gender);
		mySalary = salary;
		mySubject = subject;
	}
	public Teacher(){
		super();
		mySalary = 30000;
		mySubject = "";
	}

    // getters and setters
	public String getSubject() { return mySubject; }
	public double getSalary()  { return mySalary; }
	public void setSubject(String subject) { mySubject = subject; }
	public void setSalary(double salary)   { mySalary = salary; }

    // toString implementation: A teacher prints everything that a Person does,
    // while including salary and subject
    public String toString() {
        return super.toString()+", salary: "+mySalary+", subject: "+mySubject;
    }
}