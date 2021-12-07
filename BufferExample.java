import java.util.Scanner;

public class BufferExample 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		// System.in is the keyboard
		// Programs run from the buffer not the keyboard
		// Buffer is the input
		
		String word1;
		String word2;
		String word3;
		
		System.out.println("Enter a sentence of at least three words: ");
		
		word1=input.next();
		word2=input.next();
		word3=input.next();
		//.next goes to next whitespace char, but doesn't clear buffer
		//.nextLine goes to the next ENTER keystroke and clears buffer
		
		System.out.println("Word 1 is " + word1);
		System.out.println("Word 2 is " + word2);
		System.out.println("Word 3 is " + word3);
		input.nextLine();
		String sentence;
		System.out.println("Enter another sentence: ");
		sentence = input.nextLine();
		System.out.println(sentence);
		
	
	}

}
