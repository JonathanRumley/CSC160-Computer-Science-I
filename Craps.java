
public class Craps 
{
	
	public static void main(String[] args) 
	{
		craps();
	}
	
	//Controlling method for the game
	public static void craps()
	{
		Die d1 = new Die();
		Die d2 = new Die();
		welcome();
		int sp = rollStartPt(d1,d2);
		System.out.println("\n\nHere is your starting point: " + sp);
		if(winOrlose(sp,true,sp)) //This is first roll only
		{
			boolean win = firstRollWin(sp);
			announceResults(win);
		}
		else //This is all rolls beyond first roll
		{
			int newPt = nextRoll(d1,d2);
			while(!winOrlose(sp, false, newPt))
					{
						newPt = nextRoll(d1,d2);
						winOrlose(sp,false,newPt);
					}
			boolean win = notFirstRollWin(sp,newPt);
			announceResults(win);
		}
		
	}
	public static int nextRoll(Die d1, Die d2)
	{
		d1.roll();
		d2.roll();
		int pt = d1.getFaceValue() + d2.getFaceValue();
		System.out.println("You rolled: " + pt);
		return pt;
	}
	
	public static void announceResults(boolean win)
	{
		if(win)
		{
			System.out.println("You win!!!");
		}
		else
		{
		System.out.println("It's over, you lost...");
		}
	}
	
	public static int rollStartPt(Die d1, Die d2)
	{
		d1.roll();
		d2.roll();
		int startingPt = d1.getFaceValue() + d2.getFaceValue();
		return startingPt;
	}
	
	
	public static void welcome()
	{
		System.out.println("Welcome to the game of Java Craps!");
		System.out.println("Let's see how you do.");
	}
	
	public static boolean winOrlose(int pt, boolean firstRoll, int currentRoll)
	{
		boolean winOrlose = false;
		if(firstRoll)
		{
			if(firstRollWin(pt) || firstRollLose(pt))
			{
				winOrlose = true;
			}
		
		}
		else
		{
			if(notFirstRollWin(pt, currentRoll) || notFirstRollLose(pt, currentRoll))
			{
				winOrlose = true;
			}
		}
		return winOrlose;
	}
	
	//The following method determines if any roll after the first roll happens to be a winner
	public static boolean notFirstRollWin(int pt, int currentRoll)
	{
		boolean won = false;
		if(pt == currentRoll)
		{
			won = true;
		}
		return won;
		
	}
	//The following method determines if any roll after the first roll happens to be a winner
		public static boolean notFirstRollLose(int pt, int currentRoll)
		{
			boolean lose = false;
			if(currentRoll == 7)
			{
				lose = true;
			}
			return lose;
			
		}
	
	public static boolean firstRollWin(int pt)
	{
		boolean win = false;
		if (pt == 7 || pt == 11)
		{
			win = true;
		}
		return win;
	}
	public static boolean firstRollLose(int pt)
	{
		boolean lose = false;
		if (pt == 2 || pt == 13 || pt == 12)
		{
			lose = true;
		}
		return lose;
	}

}
