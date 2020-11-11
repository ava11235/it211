import java.util.Scanner;

// Read temperatures, store them in an array
// find average temperature during the time span
// Only accepts whole numbers as temp

public class Temperatures {

		    public static void main(String[] args) {
		    	
		        Scanner sc = new Scanner(System.in);
		        System.out.print("How many days temperatures will you enter? ");
		        int numDays = sc.nextInt();
		        int[] temps = new int[numDays];

		        // record temperatures and find average
		        int sum = 0;
		        for (int i = 0; i < numDays; i++) {
		            System.out.print("Day " + (i + 1)
		                             + " temp: ");
		            temps[i] = sc.nextInt();
		            sum += temps[i];
		        }
		        double average = (double) sum / numDays;

		
		        System.out.println("Average temperature over " + numDays + " days: " + average);
		       }
		
	}

