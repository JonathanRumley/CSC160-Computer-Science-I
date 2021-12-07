// Jonathan Rumley
// CSC 160.401
// 2/3/2020
//

import java.util.Scanner;


public class SimplyIf 
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
	}

}
