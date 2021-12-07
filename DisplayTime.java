import java.util.Scanner;

public class DisplayTime 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int secondsRemaining = seconds % 60;
		
		System.out.println("\nMinutes: " + minutes + "\nSeconds: " + secondsRemaining);
		
	}

}
