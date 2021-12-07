import java.util.Random;

public class CardDeckFunctions 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		int timesDealt[] = new int[13];
		
		
		String [] cards = {"Ace of Spades","2 of Spades","3 of Spades","4 of Spades","5 of Spades","6 of Spades","7 of Spades",
							"8 of Spades","9 of Spades","10 of Spades","Jack of Spades","Queen of Spades","King of Spades"};
		
		String [] hand = new String[5]; //Here's the hand being dealt
		
		for(int x = 0; x < 5; x++)
		{
			int whichCard = r.nextInt(13);
			while(timesDealt[whichCard] > 0) // change > 0 to 1 for another deck, 2 for a third deck, and 3 for a fourth deck
			{
				whichCard = r.nextInt(13);
			}
			timesDealt[whichCard]++;
			hand[x] = cards[whichCard];
		}
		
		for(int x=0; x<5; x++)
		{
			System.out.println(hand[x]);
		}

	}

}
