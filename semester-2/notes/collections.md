#Collections

 * a collection is an item that we treat as a unit

 * it contains a series of things

 * are dynamic, can change unlike an `array`

 * can only have objects
  * primitives must be placed inside wrapper classes

##Examples

    strings
    stacks
    lists
    queues
    binary search trees
    heaps
    graphs
    maps
    sets
    bags

##Classification

 * ####homogeneous
  * all items must be the same type

 * ####heterogeneous
  * items can be of different types

 * ####Linear Collections
  * ordered by position
  * grocery list

 * ####Hierarchical Collections
  * each item can have one parent, but infinitely many children
  * a table of contents

 * ####Graph Collections
  * each item can have infinite parents and infinite children
  * routes to cities

 * ####Unordered Collections
  * there is no relation between any of the elements
  * bag of marbles

##Operations

 * search and retrieval

 * removal

 * insertion

 * replacement

 * transversal

 * test for equality

 * determination of size

 * cloning

#Lists

 * `List` is an interface
  * `ArrayList` and `LinkedList` both implement `List`

 * `head` refers to index `0`
 * `tail` refers to index `n-1`

##Syntax

    import java.util.List;
    List <Object> foo = new ArrayList <Object> ();