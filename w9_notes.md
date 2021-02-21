## Reading ##
zyBooks Ch 6 User defined methods

**User defined methods**

Java statements grouped together for the purpose of solving a frequently used task are referred to as methods. Using methods makes a program more modular, easier to read,  
reduced redundancy and makes incremental program developement and maintenance easier.

A method consists of method definition, such as 

```
public static int sum(int n1, int n2) {
   // body 
   return n1 + n2;
}

```

and a method call, such as

```
int result = sum(5 + 7);
```
Note that the body of a method is contained within curly braces { ...}

All methods must be defined inside a class. 

Methods can have parameters, which provide input to the method and return statements, which return information from the method to the rest of the program.
When calling a method and passing actual values, those values are referred to as arguments. A method can have zero, one, or multiple parameters, separated by commas.
Note that the parameters' data types must be specified, as in the above sum example.
Only one return value is allowed from a method. If the method has no return value, this is stated by declaring a return of type void.

**Unit Testing**

Testing your code at the method level is referred to as unit testing. Unit testing is often an automated process with the use of a script, referred to as a test bench.
The inputs to the test are referred to as test vectors. jUnit is one popular testing framework for Java programs. jUnit tests can be run within the Eclipse IDE.

**Primitive vs object parameters**

Variables of the primitive type (int, double, etc.) are passed by value. This means that a copy of the variable is passed, so the original variable is not affected.
On the other hand, object types such as array are passed by reference. This means that the method can modify the original variable. 

**Method scope**

Variables declared inside a method are only visible within this method (within the curly braces encompassing the body of the method).
Some variables are declared outside of all methods. They are class member variables, referred to as fields.

**Method overloading**

When a method with the same name is defined with a different number or type of arguments, this is referred to as method overloading 
(not to be confused with method overriding, which will be discussed later in the course).

For example, this method's name is overloaded:

```
public static int sum (int n1, int n2)) {    
    return n1 + n2;

  }


public static double sum(double n1, double n2)) {    
    return n1 + n2;

  }
```
## Reference ##

https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

## Practice ##

zyBooks Ch 6.1 - 6.10 Practice (graded participation activity)

## Learning Outcomes ##

Upon successful completion of the work, students will be familiar with and able to apply the below concepts and techniques in their programs:
* User defined method basics
* Parameters and arguments
* Return statements
* Unit testing with JUnit
* Scope of variable and method definitions
*  Method overloading
* 


## Example ##

Passing parameters
```
public static void main(String[] args) {
    printNumber(4, 5);
    printNumber(17, 4);
    printNumber(0, 8);
 
}

public static void printNumber(int number, int count) {
    for (int i = 0; i < count; i++) {
        System.out.print(number);
    }
    System.out.println();
}
```





