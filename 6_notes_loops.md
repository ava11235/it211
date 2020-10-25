## Reading

zyBooks Ch 4 Loops

A loop allows the programmer to execute a group of statements multiple times. The loop executes as long as the loop condition evaluates to true.

Use the for loop to iterate through a sequence of values.
```
for (initialization; test; increment/decrement)
{
    loop body statement(s)
}
```

How does the for loop work? The loop variable takes on each successive value in the sequence, and the statements in the body of the loop are executed once for each value.

Examples of for loop uses:

Handle a series of numbers. For example, if there are n numbers, the loop should execute n times. Keeping track of a running sum.

With a for loop you need to know ahead of time how many numbers will be averaged. This type of loop is called a definite loop.

The while loop is an example of an indefinite loop, which runs until a condition is met.

while <condition>:
   <body>
   
The condition is tested at the top of the loop. If the condition is initially false, the loop body will never execute.

The while loop requires an additional consideration: the incrementing of the counter variable, i, at the bottom of the loop's body. This is handled automatically in the for loop.
```
while (condition)
{
   loop body statement(s)
}
```

What would happen if we run the following code?  Note that i will always be <10, since the loop variable value never changed. This is an example of an infinite loop. 

```
int i =  0;
while (i < 10){
    System.out.println("Hello");
    
}
```
While loops can be used to write interactive loops.

## Reference
[Oracle's Java Reference](https://docs.oracle.com/javase/tutorial/index.html)

## Practice

zyBooks Ch 3 Practice (graded participation activity)

## Learning Outcomes
Upon successful completion of the work, students will be familiar with and able to apply the below concepts and techniques in their programs

* Loop basics
* While loops
* For loops
* Loops and strings
* Nested loops
* Break and continue 
* Enumerations


## Example
Guessing game with Random class random number generator and use of conditional statements.
code [here](https://github.com/ava11235/it211/blob/master/GuessingGame.java)
