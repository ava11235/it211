
		// Read a file of scores and display the score distribution as a histogram

		import java.io.*;
		import java.util.*;

		public class ScoreCounts {
		    public static void main(String[] args) throws FileNotFoundException {
		        Scanner input = new Scanner(new File("scores.txt"));
		        //score counts up to 100
		        int[] counts = new int[101];    
		        
		     // read file into the array
		        while (input.hasNextInt()) {     
		            int score = input.nextInt();
		            // increment the count for the current score 
		            counts[score]++;            
		        }
		        
		        //print a star for each count kept in the counts array
		        for (int i = 0; i < counts.length; i++) {    
		            if (counts[i] > 0) {
		                System.out.print(i + ": ");
		                for (int j = 0; j < counts[i]; j++) {
		                    System.out.print("*");
		                }
		                System.out.println();
		            }
		        }
		    }
		

	}

