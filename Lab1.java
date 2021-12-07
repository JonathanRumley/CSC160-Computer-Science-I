import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    
    System.out.print("Name?");
    String name = input.nextLine();
    
    System.out.print("\nHow many classes?");
    int classes=input.nextInt();
    
    System.out.print("\nYour name is "+name+" and you are in "+classes+" classes.");
/////////////////    
    int i;
    Scanner input1 = new Scanner(System.in);
    System.out.println("\n\nInteger?");
    i=input1.nextInt();
    
    
    System.out.print("\nThe integer you entered is "+i+".");
    ++i;
    System.out.print("\nThe next integer is "+i+".");
  }
} 
