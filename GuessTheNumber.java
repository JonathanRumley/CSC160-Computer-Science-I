import java.util.Scanner;

public class GuessTheNumber 
{
// Didn't follow Tracy's exact code
	// Messed up the process Tracy was trying to get across, but eventually ended with a functioning do while loop
	
	
	public static void main(String[] args) 
	{
	System.out.println("Welcome to the guessing game!");
	System.out.println("The goal is to guess the number between");
	System.out.println("one and one hundred in the fewest guesses possible.\n");
	System.out.println("Here comes your first number:\n");
	
	int rNumber = (int)(Math.random()* 101);
	
	System.out.println("The random number is " + rNumber);
	
	Scanner input = new Scanner(System.in);
	System.out.println("Guess a magic number between 0 and 100");
	
	int guess = -1;
	
	while (guess != rNumber) {
		System.out.println("Enter your guess: ");
		guess = input.nextInt();
		
		System.out.println("You guessed " + guess + ".");
	
		if(guess == rNumber)
			System.out.println("Yes, you guessed the correct number!" + rNumber);
		else if(guess < rNumber)
			System.out.println("Your guess is too low: ");
		else
			System.out.println("Your guess is too high: ");
		}
	}
}
