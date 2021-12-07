import java.util.Scanner;

public class CH2 {

	public static void main(String[] args) {
		//2.1
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a degree in Celsius: ");
		
		double cel = keyboard.nextDouble();
		double fah = ((9.0 / 5) * cel + 32);
		
		System.out.println(cel + " Celsius is " + fah + " Fahrenheit");
		
		//2.2
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder: ");
		
 		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("The area is " + area + "\n" + "The volume is " + volume);
		
		//2.3
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a value for feet: ");
		
		double feet = key.nextDouble();
		double ftTOm = feet * 0.305;
		
		System.out.println(feet + " feet is " + ftTOm + " meters.");
		
		//2.4
		Scanner key1 = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");

		double lbs = key1.nextDouble();
		double lbsTOkilo = lbs * 0.454;
		
		System.out.println(lbs + " pounds is " + lbsTOkilo + " kilograms.");
		
		//2.5*
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = key1.nextDouble();
		double gratuityRate = key1.nextDouble();
		double gratuity = (gratuityRate * .01) * subtotal;
		double total = subtotal + gratuity;
		
		
		System.out.println("The gratuity is " + gratuity + " and total is " + total);

		//2.6
		System.out.println("Enter a number between 0 and 1000: ");
		int number = key1.nextInt();
		int number1 = number % 10 + number / 10;
		
		System.out.println(number1);
		
		
		
	}

}
