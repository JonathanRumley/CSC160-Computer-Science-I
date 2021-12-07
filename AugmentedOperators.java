//Jonathan Rumley
//CSC160.401
//January 27th, 2020
//

public class AugmentedOperators 
{

	public static void main(String[] args) 
	{
		int x = 0;
		int y = 5;
		int z = 10;
		
		x += y; //x = x + y;
		System.out.println(x);
		x *= y; //x = x * y;
		System.out.println(x);
		
		x++; // x = x + 1;
		System.out.println(x);
		x--; // x = x - 1;
		System.out.println(x);
		
		System.out.println(x++);
		System.out.println(x--);
		System.out.println();
		System.out.println(++x);
		System.out.println(--x);
		
	}

}
