import java.text.NumberFormat;

public class Receipt {

	public static final double TAX = .08; //a constant
	
	public static void main(String[] args) {
		
		//call the method
		double total = calculateBill(45.55, 0.20);
		System.out.println(total);
		printFormatted(total);
			
	}
	
	// Calculates total owed
	public static double calculateBill (double subtotal, double tipPercent) {
	
		
				double tax = subtotal * TAX;
				double tip = subtotal * tipPercent;
				double total = subtotal + tax + tip;
				return total;
			
	}
	
	//prints a formatted version of a currency value
	public static void printFormatted(double currencyValue) {
	
		 NumberFormat cf1 = NumberFormat.getCurrencyInstance();
	     System.out.println("Resulting values is " + cf1.format(currencyValue));

		
	}
	
}
