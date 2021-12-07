// Jonathan Rumley
// CSC 160.401
// Feb 03, 2020
//

public class SwitchStatement 
{

	public static void main(String[] args) 
	{
		double r = Math.random();
		int x = (int)(r * 4) + 1;
		System.out.println(x);
		
		if(x == 1)
		{
			System.out.println("Winter");
		}
		else
		{
			if(x == 2)
			{
				System.out.println("Spring");
			}
			else
			{
				if(x == 3)
				{
					System.out.println("Summer");
				}
				else
				{
					System.out.println("Fall");
				}
			}
		}
//************************************************************************************************************************
		//Switch Version of the Nested IF's
		int y = (int)(r * 4) + 1;
		System.out.println(y);
		
		switch(y)
		{
		case 1:
			System.out.println("Winter"); break;
		case 2:
			System.out.println("Spring"); break;
		case 3:
			System.out.println("Summer"); break;
		case 4:
			System.out.println("Fall");
		}
	}
}
