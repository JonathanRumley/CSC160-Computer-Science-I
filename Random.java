// Jonathan Rumley
// CSC 160.401
// 02/03/
//

import java.util.Scanner;

public class Random 
{

	public static void main(String[] args) 
	{
		double x = Math.random();
		System.out.println(x);
		System.out.println(x*6);
		System.out.println((int)(x*52));
		System.out.println((int)(x*52)+1); //gives next card, but doesnt prevent duplicates
		
		
	}
}
