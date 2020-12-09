## Reading ##
zyBooks Ch 7 Objects and Classes 7.9 - 7.13
zyBooks Ch 10 Inheritance 10.1, 10.2

**Constructor overloading** refers to creating multiple constructors. These constructors have the same name but differ by the number of arguments. 
This can be helpful when an object is instantiated with default values, whereas another object can be instantiated with parameters passed during its creation.
Note that if custom constructors are defined, the default constructor must also be defined, or a syntax error will occur.

A variable referring to an object is referred to as a **reference variable**. Reference variables are of a class type, including String or custom defined types.
The reference variable stores the memory address of an object. 

The `this` keyword is used to reference class members. 

Java has primitive type, such as integers, or doubles or booleans.  The data for primitive types is stored directly.
Java's reference types such as objects, store a reference to the memory location where the object is stored.

**Java wrapper classes** provide a way to reference primitive types as objects. Why this is helpful will be discussed in upcoming lectures. 
For example, the Integer class is a wrapper around the primitive int type. Note that wrapper classes are immutable. 
The mechanisms for seamless conversion between primitive and wrapper classes are called autoboxing (primitive -> wrapper class ) and unboxing (wrapper class -> primitive).

**Inheritance** allows for the forming of new classes based on existing classes while reusing or extending their attributes and behavior.
The parent class, also known as **superclass**, is extended by the child class, also known as **subclass**. Upon extending the superclass, the subclass has access
to the fields and methods of the superclass.

The general syntax for extending a superclass is: 

`public class name extends superclass { ....}`


**Member access** of class members can be **public, private, or protected**. 
Public access means that subclasses have access to the public members of the class, but not to the members with private access.
Protected access allows subclasses access only if they are in the same package. 

## Reference ##
https://www.w3schools.com/java/java_wrapper_classes.asp
https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html



## Practice ##

zyBooks Ch 7.9 - 7.13  Practice (graded participation activity)
zyBooks Ch 10.1, 10.2  Practice (graded participation activity)

## Learning Outcomes ##

Upon successful completion of the work, students will be familiar with and able to apply the below concepts and techniques in their programs:
* Constructor Overloading
* Objects and References
* The "this" keyword and implicit parameter
* Primitive and reference types
* Wrapper classes in the Java library such as Integer and Double
* Inheritance: Derived classes
* Inheritance: Access by members of derived classes
