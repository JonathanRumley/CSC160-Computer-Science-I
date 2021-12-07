import java.util.Scanner;

public class Lab5_3
{

	public static void main(String[] args) 
	{
		System.out.println("");
		Scanner input = new Scanner(System.in);
		String phrase = input.nextLine();
		while(!phrase.equals("quit"))
			{
				System.out.println(phrase.toUpperCase());
			    input = new Scanner(System.in);
			    phrase = input.nextLine();
			}
			 
	}

}


