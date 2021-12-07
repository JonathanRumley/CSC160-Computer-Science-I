import java.util.Scanner;

public class Lab2_1

{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Number?");
    int x = input.nextInt();
    if(x < 1 || x > 4)
      System.out.println("That number is not valid.");
    else if (x == 1)
      System.out.println("1 is Cyan");
    else if (x == 2)
      System.out.println("2 is Magenta");
    else if (x == 3)
      System.out.println("3 is Yellow");
    else if (x == 4)
      System.out.println("4 is Black");
    
  }
}