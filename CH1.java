
public class CH1 {

	public static void main(String[] args) {
		//1.5
		double answer = (((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5));
		System.out.println("The first answer is " + answer);
		
		//1.6
		int answer1 = (1+2+3+4+5+6+7+8+9);
		System.out.println("The answer is " + answer1);

		//1.7
		double answer2 = (4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11));
		double answer3 = (4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13));
		
		System.out.println("Your answers are " + answer2 + " and " + answer3);
		
		//1.8
		double radius = 5.5;
		double perimeter = (2 * radius * Math.PI);
		double area = (radius * radius * Math.PI);
		
		System.out.println("Here is your perimeter: " + perimeter + "\n" + "Here is your area: " + area);
		
		//1.9
		
		double width = 4.5;
		double height = 7.9;
		double perimeter1 = width + height;
		double area1 = width * height;
		
		System.out.println("The perimeter of the rectangle is " + perimeter1 + "\n" + "The area is of the rectangle is " + area1);
		
		//1.13*
		
		double a, b, c, d, e, f, x, y;
		
		a = 3.4;
		b = 50.2;
		c = 2.1;
		d = .55;
		e = 44.5;
		f = 5.9;
		
		x = ((e * d - b * f) / (a * d) - (b * c));
		y = ((a * f - e * c) / (a * d - b * c));
		
		System.out.println("Here is the vaule for x and y: " + x + y);
		
		
	}

}
