#Polymorphism

## Polymorphism is the act of choosing the correct overriden method based on the object that invoked the call

 * Overridden
  * chosen at ***runtime***
  * same name
  * ***same*** parameters
  * ***different*** function body
 * Overloaded methods
  * chosen at ***compiletime***
  * same name
  * ***different*** parameters
  * ***same*** function body

 * Dynamic Binding is choosing the actual method at runtime
 * The element type of an array can be an interface

 * concrete classes are classes in which all methods are defined.

  * only concrete classes can be instantiated

 * abstract classes are non-concrete and cannot be instantiated

  * they can be used as the type, eg:

          abstract class Animal {}
          ...
          Animal x = new Dog();
 * `instanceof` is an operator, it is used to test conditionality of a `type`, eg:
 
          Double(4.3) instanceof Double
          // true
 
 * 
