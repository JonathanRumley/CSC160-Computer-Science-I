// Jonathan Rumley
// CSC 160.401
// 02/03/2020
//

public class CommonErrors 
{

	public static void main(String[] args) 
	{
		boolean even = false;
		int oddCount = 0; // Count of odd numbers only
		int number = (int)(Math.random() * 100) + 1;
		even = number % 2 == 0;
		if(even)
			System.out.println("Number: " + number + " is even.");
		else
		{
			System.out.println("Number: " + number + " is odd.");
			oddCount++;
		}
		System.out.println("Count of odd numbers: "+ oddCount);
		
		//***********************************************************************
		System.out.println("\n*********** new thought starts here**************");	
		if(even)
			if(number > 50)
				System.out.println("The number "+number+" is a large even number.");
			else;
		else
			System.out.println("The number is odd.");
			
			
	}

}
