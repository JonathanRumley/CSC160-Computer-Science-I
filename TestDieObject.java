
public class TestDieObject 
{

	public static void main(String[] args) 
	{
		Die d = new Die();
		
		for(int x=0; x<100; x++)
		{
		
		System.out.println("Here is your random roll: " + d.getFaceValue());
		// Testing roll function of a new Die Object
		d.roll();
		}
	}
}
