# Methods in JAVA

- Java methods are the blocks of code that performs a specific task.
- All the methods in Java must belong to a class.
  
  [Here](Methods/MethodsDemo.java) is the demo of the simple method program.

### Why use method?
- **Code reusability**
- **Modularity**
- **Readability**
- **Maintainability**

## Types of methods in JAVA
1. **Predefined Method**
~~~
Math.random();
Math.PI;
~~~

2. **User-defined Method**
   ~~~
   sayHello();
   Greet();
   setName();
   ~~~

## Different ways to create Java method

1. [Instance Method](Methods/InstanceDemo.java): Access the instance data using the object name, declared inside the class.

#### Types of instance methods:

 **Accessor Methods(Getters)**
   - Used to read the value of private instance variables.
   - Start with get followed by the variable name (first letter   capitalized).
   - Helps in encapsulation by providing controlled access to data.
  
 **Mutator Methods(Setters)**
   - Used to modify or update the value of private instance variables.
   - Start with set followed by the variable name (first letter capitalized).
   - Provides a controlled way to change data in a class.
  

2. [Static Method](Methods/StaticDemo.java): Static keyword is used to create the method.
   - It is not associated with any object or instace.
   - It can be accessed by all the instance of the class.
   - Static methods can access static variables directly.
   - They cannot access the instance variables or methods directly.
   - Static methods can be accessed directly in both static and non-static contexts

### Restrictions on static methods
- Non-static data members or non-static methods cannot be used by static methods, and static methods cannot call non-static methods directly.
- In a static environment, this and super are not allowed to be used.

### Why is the main method static in java?
The main method must be static because the JVM does not create an object of the class before invoking it. If it were a non-static method, JVM would first build an object before calling the main() method, resulting in an extra memory allocation difficulty.
     