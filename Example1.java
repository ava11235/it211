import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);
		        double average = 0.0;
		        System.out.print("Enter a number: ");
		        double num1 = sc.nextDouble();
		        
		        System.out.print("Enter a second number: ");
		        double num2 = sc.nextDouble();
		        
		        System.out.print("Enter a third number: ");
		        double num3 = sc.nextDouble();
		        
		       average = (num1 + num2 + num3) / 3;
		          
		       System.out.print("The average of " + num1 + ", " + num2 + ", and " + num3 );
		       System.out.println(" is " + average);
		       
		       sc.close();
		    }



	}

