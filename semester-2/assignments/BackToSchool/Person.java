/**
 *
 * The root of the Person hierarchy.  All persons have
 * a name and an age and a gender.  In addition, a Person
 * knows how to print itself.
 */

class Person
{
  private String myName ;   // name of the person
  private int myAge;        // person's age
  private String myGender;    // "M" for male, "F" for female

  // default constructor
  public Person()
  {
    myName = "";
    myAge = 1;
    myGender = "N";
  }

  // constructor
  public Person(String name, int age, String gender)
  {
    myName = name;
    myAge = age;
    myGender = gender;
  }

  public String getName()
  {
    return myName;
  }

  public int getAge()
  {
    return myAge;
  }

  public String getGender()
  {
    return myGender;
  }

  public void setName(String name)
  {
    myName = name;
  }

  public void setAge(int age)
  {
    myAge = age;
  }

  public void setGender(String gender)
  {
    myGender = gender;
  }

  public String toString()
  {
    return myName + ", age: " + myAge + ", gender: " + myGender;
  }
}