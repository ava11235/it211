import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		int number = random.nextInt(24) + 1;
		int attempts = 0;
		int guess;
		boolean correctGuess = false;
		
		Scanner sc = new Scanner(System.in);
		
		while (!correctGuess) {
			System.out.println("Guess a number between 1 and 25: ");
			guess = sc.nextInt();
			attempts ++; 
			
			if(guess  == number) {
				correctGuess = true;
			}
			
			else if (guess < number) {
				System.out.println("Your guess is too low.");
			}
			else if (guess > number) {
				System.out.println("Your guess is too high");
			}
			
			System.out.println("You guessed correctly! The number was " + number);
			System.out.println("You guessed after " + attempts + "attempts");
		}
		
		
	}

}
