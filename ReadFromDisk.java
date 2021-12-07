import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFromDisk 
{
	public static void main(String[] args) 
	{
		File diskIn = new File("Lab6Data.txt");
		Scanner input;
		try {
			input = new Scanner(diskIn);
			
			
			String name = "unknown";
			name = input.nextLine();
			int amt = 0;
			int total = 0;
			amt = input.nextInt();
			input.nextLine(); //
			total += amt;
			
			while(!name.equals("quit"))
			{
				System.out.println(name);
				System.out.println(amt);
				name = input.nextLine();
				amt = input.nextInt();
				input.nextLine(); // This gets rid of the return left in the buffer after nextInt()
				total += amt;
			}
			System.out.println("\nTotal amount: "+ total);
			input.close();
		} catch (FileNotFoundException e) 
		{
			System.out.println("Don't get frustrated, the file 'Lab6Data.txt was not found at the expected location.");
			System.out.println("Perhaps you forgot to copy the file to the correct location or");
			System.out.println("the name on the disk file may be spelled incorrectly.");
		}
	
	}

}
