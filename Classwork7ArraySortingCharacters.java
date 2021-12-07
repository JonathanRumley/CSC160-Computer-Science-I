import java.util.Scanner;

//Jonathan Rumley
//CSC 160.401
//March 11, 2020
//Chapter 7 Classwork

public class Classwork7ArraySortingCharacters 
{
	public static void main(String[] args)
	{
		//trims out the spaces
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String s = input.nextLine();
		s = sort(s);
		System.out.println(s.trim());
	}
	
	public static String sort(String str) 
	{
		//converting all str to LOWERCASE
		str = str.toLowerCase();
		//Creates array named ch with data type of char
		char[] ch = str.toCharArray();
		for(int x=0; x< ch.length - 1; x++)
		{
			char currentMin = ch[x];
			int currentMinIndex = x;
			
			for(int y = x + 1; y < ch.length; y++)
			{
				if(currentMin > ch[y])
				{
					currentMin = ch[y];
					currentMinIndex = y;
				}
			}
			
			if(currentMinIndex != x)
			{
				ch[currentMinIndex] = ch[x];
				ch[x] = currentMin;
			}
		}
		//converts array ch to String type as variable s
		String s = new String(ch);
		return s;
				
	}

}
