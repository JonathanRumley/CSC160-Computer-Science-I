import java.util.Scanner;

public class ReverseAString 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		System.out.println(reverseString(string));
	}	
		public static String reverseString(String s)
		{
			if(s.length() > 1)
			{
				char keep = s.charAt(s.length() - 1);
				String k = Character.toString(keep);
				s = s.substring(0, s.length()-1);
				String r = reverseString(s);
				s = k + r;
				return s;
			}
			else
				return s;
	}

}
