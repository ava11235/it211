//*******************************************************************
//  BookTest Class
//
// Tests the Book and BookInventory classes and their methods

//*******************************************************************


import java.util.Scanner;

public class BookTest {



	    public static void main(String args[]) {
	   
	        System.out.println("Welcome to the bookstore");
	        System.out.println();

	        Scanner sc = new Scanner(System.in);
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            // get input from user
	            System.out.print("Enter product genre: ");
	            String genre = sc.nextLine();

	            // create objects
	            BookInventory bi = new BookInventory();
	            Book product = bi.getProduct(genre);

	            // display the output
	            String bookDisplay = "\nBook\n" +
	                "Code:        " + product.getGenre() + "\n" +
	                "Description: " + product.getDescription() + "\n" +
	                "Price:       " + product.getPriceNumberFormat() + "\n";
	            System.out.println(bookDisplay);

	            // see if the user wants to continue
	            System.out.print("Continue? (y/n): ");
	            choice = sc.nextLine();
	            System.out.println();
	        }
	        sc.close();
	        System.out.println("Exiting book inventory");
	    }
	}