import java.util.Calendar;

public class FormattedOutput 
{

	public static void main(String[] args) 
	{
		int x = 3;
		double y = 3.14159;
		String z = "This is a string";
		
		System.out.printf("x value: %3d \ny value: %4.2f \nz value: %s\n",x,y,z);
		System.out.printf("x value: %3d \ny value: %6.4f \nz value: %S\n",x,y,z);
		
		Calendar c = Calendar.getInstance();
		System.out.println("Current Date and Time");
		System.out.format("%tB %te, %tY%n",c,c,c);
		System.out.format("%tl:%tM%tp%n",c,c,c);
		
		
		
	}

}
