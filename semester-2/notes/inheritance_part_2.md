##Inheritance Part 2

* ###Interfaces

 * classes are `extend(s)`ed, interfaces are `implement(s)`ed

 * an interface is a mechanism that allows objects to interact with each other
 * a class can implement any amount of interfaces, while it can only inherit one
 * interfaces have no private data members

             public interface Employable {
                 /* empty methods for salary, past employment, etc.*/
             }
             public class Teacher extends Employable {
                 /* completed methods for salary, past employment, etc. */
             }

 * an interface can be used when the type of object being used can be interchanged, eg:

             // all of this code is valid, provided that
             // * Shape is an interface
             // * Any object created with Shape implements Shape
             Shape s = new Rect(/*params*/);
             Shape s = new Triangle(/*params*/);
             Shape s = new Circle(/*params*/);

  * can an array of different classes be created?, eg:

             Shape[] shapes = {Rect(), Triangle(), Circle()};

* ###Abstract Classes
 * abstract keyword must come first?
 * used when creating a class that will be 'completed' by its derived classes.
 * can implement an interface
 * methods inside of an abstract class that actually do something are final (required? recomended?)
 * methods inside of an astract class that do nothing are declared with abstract