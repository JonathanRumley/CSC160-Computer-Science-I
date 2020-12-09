//
//Jonathan Rumley
//CSC 160_401
//5/04/20
//Final Project - Game: 30 or Bust
//
import java.util.Scanner;

public class Bust30 
{
	static Scanner playerReady = new Scanner(System.in);
	static Scanner playerName = new Scanner(System.in);
	static Scanner playerChoice = new Scanner(System.in);

	public static int player1Score = 0;
	public static int player2Score = 0;
	
	public static String player1 = "";
	public static String player2 = "";
	
	static int gameTotalp1 = 0;
	static int gameTotalp2 = 0;
	
	public static void main(String[] args) 
	{	
		readyGo();			//engages user / readiness
		welcomeMsg();		//msg to welcome players
		gameOn();			//runs the game
		
		
		//STUBBED***
		//declareWinner();
		//playAgain();
		//reviewGame();
		
	}
	
	
	public static void readyGo()
	{
		gameTotalp1 = 0;
		gameTotalp2 = 0;
		
		player1Score = 0;
		player2Score = 0;
		
		System.out.println("Hello gamers, are you ready to start? Yes or No?");
		System.out.println("\n-------------------------------------------------|\n");
		String ready = playerChoice.nextLine();
		if(ready.equals("Yes"))
			gameOn();
		else 
			System.out.println("\nPlease take a minute, refresh, relax, and resituate, so the game can start...\n");

			readyGo();
	}
	
	public static void welcomeMsg()
	{
		System.out.println("\nPlease enter the first players name of choice: ");
		System.out.println("\n-----------------------------------------------|\n");
		player1 = playerName.nextLine();
		System.out.println("\nWelcome " + player1 + " to Dice Game: 30 or Bust. \n\nThe goal of the game is to add up a score of exactly 30 by rolling two dice then keeping \nboth of the face values or just one of the face values, which will be added to your score, but \ngoing over 30 resets your score to 0....so be careful of what face values you keep & which ones you discard.\n");
		System.out.println("*******************************************************************************************************************\n");
		System.out.println("Please enter the second players name of choice: ");
		System.out.println("\n----------------------------------------------|\n");
		player2 = playerName.nextLine();
	
		System.out.println("\nWelcome " + player2 + " to Dice Game: 30 or Bust. \n\nThe goal of the game is to add up a score of exactly 30 by rolling two dice then keeping \nboth of the face values or just one of the face values, which will be added to your score, but \ngoing over 30 resets your score to 0....so be careful of what face values you keep & which ones you discard.\n");
		System.out.println("*******************************************************************************************************************\n");
	}
	
	public static int rollDie()
	{
		int rVal = (int)(Math.random()*6+1);
		return rVal;
	}
	
	public static String gameOn()
	{
		welcomeMsg();
		boolean gameOver = false;
		String winner = "";
		while(!gameOver)
		{
			String p1Wins = p1Turn();
			String p2Wins = "";
			
			if(!p1Wins.equals("Winner"))
			{
				p2Wins = p2Turn();
			}
			
			if(p1Wins.equals("Winner"))
			{
				gameOver = true;
				winner = "p1";

			}
			else if (p2Wins.equals("Winner"))
			{
				gameOver = true;
				winner = "p2";
			}
		}
		
		if(winner.equals("p1"))
		{
			System.out.println("Woohoo, we have an offical winner, congrats " + player1 + ", see you next time!!\n");
			return "Player " + playerName;
		}
		
		else
		{
			System.out.println("Woohoo, we have an offical winner, congrats  " + player2 + ", see you next time!!\n");
			return "Player " + playerName;
		}
	}
	
	public static String p1Turn()
	{
		String endTurn = "Loser";
		int d1Val = rollDie();
		int d2Val = rollDie();
		int dTotal = d1Val + d2Val;
		gameTotalp1 = player1Score;
		System.out.println("\n-------------------------------------------------|\n");
		System.out.println(player1 +", here is your current score: " + player1Score);
		System.out.println("\nPlayer 1 Roll's:");
		System.out.println("Die 1 Value: " + d1Val + ", Die 2 Value: " + d2Val + ", With a total of: " + dTotal);
		System.out.println("\nWhat would you like todo:\nA) Keep Die 1's value?\nB) Keep Die 2's value?\nC) Keep the total of both dice?\nPlease enter your choice: ");
		System.out.println("\n-------------------------------------------------|\n");
		String pChoice = playerChoice.nextLine();
		pChoice = pChoice.toUpperCase();
		if(pChoice.equals("A"))
			gameTotalp1 += d1Val;
		else 
			if(pChoice.equals("B"))
				gameTotalp1 += d2Val;
				if(pChoice.equals("C"))	
					gameTotalp1 = gameTotalp1 + d1Val + d2Val;
				//if(!pChoice.equals("A") || !pChoice.equals("B") || !pChoice.equals("C"))     ******NOT NECESSARY FOR GRADE
				//System.out.println("\nPlease enter A, B, or C.\n");               *****PRINTS EVERYTIME
		if(gameTotalp1 > 30)
			gameTotalp1 = 0;
		if(gameTotalp1 == 30)
			endTurn = "Winner";
		if(gameTotalp1 < 30)
			player1Score = gameTotalp1;
		return endTurn;
	}
	
	public static String p2Turn()
	{
		String endTurn = "Loser";
		int d1Val = rollDie();
		int d2Val = rollDie();
		int dTotal = d1Val + d2Val;
		gameTotalp2 = player2Score;
		System.out.println("\n-------------------------------------------------|\n");
		System.out.println(player2 + ", here is your current score: " + player2Score);
		System.out.println("\nPlayer 2 Roll's:");
		System.out.println("Die 1 Value: " + d1Val + ", Die 2 Value: " + d2Val + ", With a total of: " + dTotal);
		System.out.println("\nWhat would you like todo:\nA) Keep Die 1's value?\nB) Keep Die 2's value?\nC) Keep the total of both dice?\nPlease enter your choice: ");
		System.out.println("\n-------------------------------------------------|\n");
		String pChoice = playerChoice.nextLine();
		pChoice = pChoice.toUpperCase();
		if(pChoice.equals("A"))
			gameTotalp2 += d1Val;
		else 
			if(pChoice.equals("B"))
				gameTotalp2 += d2Val;
				if(pChoice.equals("C"))	
					gameTotalp2 = gameTotalp2 + d1Val + d2Val;
					//if(!pChoice.equals("A") || !pChoice.equals("B") || !pChoice.equals("C"))     ******NOT NECESSARY FOR GRADE
						//System.out.println("\nPlease enter A, B, or C.\n");               *****PRINTS EVERYTIME
		if(gameTotalp2 > 30)
			gameTotalp2 = 0;
		if(gameTotalp2 == 30)
			endTurn = "Winner";
		if(gameTotalp2 < 30)
			player2Score = gameTotalp2;
		return endTurn;
		
	}
		
}