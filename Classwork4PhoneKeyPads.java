// Jonathan Rumley
// CSC 160.401
// Feb. 12, 2020
//

import java.util.Scanner;

public class Classwork4PhoneKeyPads 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an lowercase or uppercase letter to view corresponding phone key pad digit: ");
		
		String l = input.nextLine();
		l = l.toUpperCase();
		char c = l.charAt(0);
		
		if(c >= 'A' && c <= 'C')
			System.out.println("The corresponding number for " + c + " is 2.");
		else if(c >= 'D' && c <= 'F')
			System.out.println("The corresponding number for " + c + " is 3.");
		else if(c >= 'G' && c <= 'I')
			System.out.println("The corresponding number for " + c + " is 4.");
		else if(c >= 'J' && c <= 'L')
			System.out.println("The corresponding number for " + c + " is 5.");
		else if(c >= 'M' && c <= 'O')
			System.out.println("The corresponding number for " + c + " is 6.");
		else if(c >= 'P' && c <= 'S')
			System.out.println("The corresponding number for " + c + " is 7.");
		else if(c >= 'T' && c <= 'V')
			System.out.println("The corresponding number for " + c + " is 8.");
		else if(c >= 'W' && c <= 'Z')
			System.out.println("The corresponding number for " + c + " is 9.");
		else
			System.out.println(c + " is an invalid input.");
		
		
		
	}

}
