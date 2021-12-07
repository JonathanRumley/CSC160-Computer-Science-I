//Jonathan Rumley
//CSC160.401
//Feb. 26, 2020
//Classwork5-V&C Counting

import java.util.Scanner;

public class Classwork5VowelsConsonants 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string of words: ");
		boolean again = true;
		
		String userIn = input.next();
		userIn = userIn.toLowerCase();
		System.out.println("You entered "+userIn);
		
		int vowels = 0;
		int consonants = 0;
		int num;
		
		while(again)
		{
			for(num = 0; num < userIn.length(); num++)
				{
					if(userIn.charAt(num) == 'a' ||userIn.charAt(num) == 'e' ||userIn.charAt(num) == 'i' ||userIn.charAt(num) == 'o' ||userIn.charAt(num) == 'u')
						vowels++;
					else if(userIn.charAt(num) >= 'a' && userIn.charAt(num) <= 'z')
						consonants++;
				}
			
			System.out.println("The number of vowels is : "+ vowels);
			System.out.println("The number of consonants is : "+ consonants);
			
			System.out.println("Do you want to play again: Yes or No?");
			String newIn = input.next();
			if(newIn.equals("No"))
				again = false;
		}
		
		
	
		
	}

}
