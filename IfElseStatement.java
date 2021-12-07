import java.util.Scanner;

public class IfElseStatement 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer value: ");
		int x = input.nextInt();
		if(x < 100)
		{
			System.out.println("That integer isn't very big.");
		}
		else
		{
			System.out.println("That integer will do.");
		}
	}

}
