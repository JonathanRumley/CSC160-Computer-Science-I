import java.util.Scanner;

public class CH4 
{

	public static void main(String[] args) 
	{
		//4.1 GEOMETRY (AREA OF PENTAGON)
		System.out.println("Welcome to the Pentagon Area Finder!!");
		System.out.print("Enter the length from the center to a vertex:");
		
		Scanner input = new Scanner(System.in);
		double l = input.nextDouble();
		double pentagonArea= ((5 * l * l) / (4 * Math.tan(Math.PI/5)));
		
		System.out.println(pentagonArea);
		System.out.println();
		
		//4.4 GEOMETRY (AREA OF HEXAGON)
		System.out.println("Welcome to the Hexagon Area Finder");
		System.out.print("Enter a side of the hexagon: ");
		
		Scanner input1= new Scanner(System.in);
		double s = input.nextDouble();
		double hexagonArea = ((6 * Math.pow(s,2) / (4 * Math.tan(Math.PI/6))));
		
		System.out.printf("%4.2f" ,hexagonArea);
		System.out.println();
		
		//4.5 GEOMETRY (AREA OF REGULAR POLYGON)
		System.out.println("Welcome to the Polygon Area Finder");
		System.out.println("Enter the number of sides: ");
	
		Scanner input2 = new Scanner(System.in);
		double pSides = input.nextDouble();
		
		System.out.println("Enter the side length: ");
		double sLength = input.nextDouble();
		double polygonArea = ((pSides * Math.pow(sLength,2)) / (4 * Math.tan(Math.PI/pSides)));
		
		System.out.println("The area of the polygon is " + polygonArea);
		System.out.println();
		
		//4.8 ASCII (FIND A CHARACTER OF ASCII CODE)
		char ch;
		short ascIIV;
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		ch = input3.next().charAt(0);
		
		ascIIV=(short)ch;
		System.out.println("The ASCII Value of the character entered is: " + ascIIV);
		        
	}	
		
}
