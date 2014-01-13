##Inheritance

 * defining a 'sub-class' to have the characteristics of a 'parent-class'

 * java does not allow for multiple inheritance, or a 'sub-class' having multiple 'parent-classes'

         Object -> Person, Place, Thing
              Person -> Student, Principal, Teacher
                  Student -> Highschool, College

         class Person extends Object {}     // Person has characteristics of Object
         class Student extends Person {}     // Student has characteristics of Person (and in turn Object)
         class Highschool extends Student {} // Highschool has characteristics of Student (and in turn Person (and in turn Object))

 * super refers to the parent class:

         Highschool: super.someMethod()
         Student:    someMethod()

     * sub-classes should use `super(<private data members>)` as the first thing in the constructor to gain access to the private data members of its parent-class(es)

 * every java class is a sub-class of the Object class

 * what happens if two classes extend eachother?
