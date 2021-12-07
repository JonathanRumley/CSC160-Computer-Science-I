import java.util.Scanner;

public class ComputeAverage 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		double number1 = 0.0;
		double number2 = 0.0;
		double number3 = 0.0;
		double average = 0.0;
		
		System.out.print("Enter first number: ");
		number1 = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		number2 = keyboard.nextDouble();
		System.out.print("Enter third number: ");
		number3 = keyboard.nextDouble();
		
		average = (number1 + number2 + number3) / 3;
		System.out.println("The average of your numbers is "+average);

	}

}
