import java.util.Scanner;

public class FunWithStrings {

	public static void main(String[] args) {
		
		// Declare scanner for later use
		Scanner sc = new Scanner(System.in);

		// Declare some strings for string methods examples
		
		String s1 = "Northern cardinal";
		String s2 = "Peregrine Falcon";

		// Use String methods
		System.out.println(s1.length());  //length of the string
		System.out.println(s1.indexOf("c")); //first index of letter  c
		System.out.println(s1.substring(7, 10)); //substring of a string with index 7-0

		System.out.println(s2.toLowerCase()); 
		System.out.println(s2.toUpperCase());  //print string 

		// strings are immutable
		String s4 = "Bald eagle";
		s4.toUpperCase();
		System.out.println(s4);

		String s5 = "Seagull";
		s5 = s5.toUpperCase();
		System.out.println(s5);

		//Next example
		System.out.print("Please first number: ");

		int num1 = sc.nextInt();

		System.out.print("Please second number: ");
		int num2 = sc.nextInt();

		int product = num1 * num2;
		
		System.out.println("The product is " + product);

	}

}