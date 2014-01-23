##the `ArrayList` class

 * a data structure for storing, modifying and accessing elements of one class

 * declaration:

     * `ArrayList <ClassName> arrayListName = new ArrayList <ClassName> (params);`

     * a size for the array can be specified as a parameter

     * ***what else can be a parameter?***

 * accessing:

            objectAtIndex = arrayListName.get(index);

 * modifying:

  * add

            void add(index, object){...}
            boolean add(object){...}
  * remove

            Object remove(index){...}
  * set

            Object set(index, object){...}


##wrapper classes

 * wrapper classes provide a way to treat ***primitive*** data types as ***objects***

 * wrapper classes can be *unwrapped*, or can return their primitive selves

     * the unwrapping method is always the primitive data type followed by `Value`, eg:

        * `char charValue();`

     * `boolean char byte short int long float double`
     * `Boolean Character Byte Short Integer Long Float Double`

##for-each loops

 * a shorthand for accessing elements in an iterator

        dataType[] arrayName = ...
        for(int i = 0; i<arrayName.length; i++){
            System.out.println(arrayName[i]);
        }

 * versus

         dataType[] arrayName = ...
         for(dataType element : arrayName){
            System.out.println(element);
         }