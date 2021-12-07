
public class StringComparisons 
{

	public static void main(String[] args) 
	{
		String string1 = "This is a string";
		String string2 = "This is a string";
		if (string1 == string2) System.out.println("The strings match");
		else System.out.println("The strings do not match");
		
		string1 = string1 + " that is longer";
		if(string1 == string2) System.out.println("The strings match");
		else System.out.println("The strings do not match");
		
		string2 = string2 + " that is longer";
		
		System.out.println(string1 +"\n" + string2);
	
		if(string1.equals(string2)) System.out.println("The string content matches");
		else System.out.println("The string contents do not match");
	
		}
	}
