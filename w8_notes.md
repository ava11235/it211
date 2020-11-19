## Reading ##
zyBooks Ch 5 Arrays 5.5 - 5.10

Java supports two and higher dimensions arrays. The below example demonstrates declaring and printing the values a two dimenstional array.

```
import java.util.Arrays;

// Use a two dimensional array to populate 3 days worth of temperatures
public class TempArray2D {

	public static void main(String[] args) {

		// Declare two dimensional rectangular array
		// to represent 3 days worth of temperature readings
		
		double[][] temp = { { 66.8, 70.3, 69.4 }, // Row 0 Day 1
				{ 71.5, 80.4, 75.8 }, // Row 1 Day 2
				{ 88.4, 70.3, 77.0 } };

		printTemps(temp);

	}

	// Print the values of the array
	// Need a nested loop
	public static void printTemps(double[][] temp) {
		for (int i = 0; i < temp.length; i++) {

			for (int j = 0; j < temp[i].length; j++) {
				System.out.print(temp[i][j] + " ");
			}
			System.out.println(); // Insert newline after each row
		}
	}

}
```

Java's enhanced for each loop allows for iterating over each element in an array with more concise syntax than the for loop.

```
String[] names = {"Troy", "Abed", "Jeff"};

        //enhanced for loop 
        for (String name: names) 
        { 
            System.out.println(name); 
        } 
```


## Reference ##

The Java Arrays class in the java.util package

## Practice ##

zyBooks Ch 5.5 - 5.10 Practice (graded participation activity)

## Learning Outcomes ##

Upon successful completion of the work, students will be familiar with and able to apply the below concepts and techniques in their programs

Multiple Arrays

Swapping array elements

Common array operations such as copying and comparing arrays

Reversing an array

Two dimensional arrays

Enhanced for each loop

## Example ##
Read scores from a file and display a histogram of the scores 
