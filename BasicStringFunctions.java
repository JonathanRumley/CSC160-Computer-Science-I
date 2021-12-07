import java.util.Scanner;

public class BasicStringFunctions 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string at least 10 characters long with leading and ending spaces: ");
		String phrase = input.nextLine();
		System.out.println("There are " + phrase.length() + " characters in that phrase.");
		phrase = phrase.trim();
		System.out.println("With beginning and ending spaces removed, ");
		System.out.println("the phrase now has " + phrase.length() + " characters.");
		System.out.println(phrase);
		System.out.println("The fourth letter of the phrase is: " + phrase.charAt(4));
		System.out.println(phrase.toUpperCase());
		System.out.println(phrase.charAt(7));
		System.out.println(phrase.indexOf('q',0));
		
	}

}
