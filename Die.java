// Jonathan Rumley
// CSC 160.401
// March 2nd, 2020
//
public class Die 
{
	private int faceValue = 0;
	
	public Die()
	{
		roll();
	}
	
	public void roll()
	{
		faceValue = (int)(Math.random() * 6) + 1;
		
	}
	
	public int getFaceValue()
	{
		return faceValue;
	}
}
