import java.util.Scanner;

// Jonathan Rumley
// CSC 160.401
// 02/03/2020
//

public class NestedIfs 
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
			if(x > 1000)
			{
				System.out.println("That integer is WAYYY too big.");
			}
			else 
			{
				System.out.println("That integer will do.");
			}
	}

}
