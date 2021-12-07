
public class CharacterComparison 
{

	public static void main(String[] args) 
	{
		if('A' > 'a') System.out.println("'A' is bigger");
		else System.out.println("'a' is bigger");
		
		if('A' > '1') System.out.println("'A' is bigger");
		else System.out.println("'1' is bigger");
		char singleCharacter = 'a';
		char anotherCharacter = (char)(singleCharacter - 32);
		System.out.println(singleCharacter + " " + anotherCharacter);
	}

}
