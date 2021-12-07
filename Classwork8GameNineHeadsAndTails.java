//Jonathan Rumley
//CSC 160_401
//4/3/2020
//Programming Exercise Chapter Eight - 8.11
//HAVING ISSUES WITH ARRAYS FOR SOME REASON.
//Pandemic Lockdown....

import java.util.Scanner;

public class Classwork8GameNineHeadsAndTails 
{
	//Had to get help from stack over flow web site with this method
	 public static int[] decimalToBinary(int decimal)
	   {
	   int[] nums = new int[9];
	   for (int i = nums.length-1;i>=0 && decimal >0;i--)
	   {
	     if ( decimal% 2 == 0)
	       nums[i] = 0;
	     else
	       nums[i] = 1;
	     decimal /= 2;
	   }
	   return nums;
	   }
	 //Also got help with this method from the same web site
	 public static void printHeadsAndTails(int[] nums)
	   {
	     for (int i =0; i<9;i++)
	     {
	       if (nums[i] == 0) System.out.print("H ");
	       else  System.out.print("T ");
	       if ((i+1) % 3 == 0) System.out.println();
	     }
	   }

	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Game: Nine, Heads and Tails.\n\nPlease enter a number between 0 and 511: ");

		int userNum = input.nextInt();
		
		//I think that I did this right?
		 int[] nums = decimalToBinary(userNum);
		     printHeadsAndTails(nums);
		     
		}
		
		//double [][][] = {{{},{}}};
		//tests
		//int userNum = input.nextInt();
		//System.out.println("\n"+userNum);
		
	}
