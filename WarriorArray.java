//Jonathan Rumley
//CSC 160_401
//4/13/2020
//Classwork 10 - Warrior Arrays

public class WarriorArray 
{

	public static void main(String[] args) 
	{
		WarriorFred[] warriors = new WarriorFred[5];
		for(int x=0; x < 5; x++)
		{
			warriors[x] = new WarriorFred();
		}
		System.out.println("Here are the original five Warrior Fred characters: ");
		for(int x=0; x < 5; x++)
		{
			warriors[x].printInfo();
		}
		
		warriors[0].setNickName("Jahtube");
		warriors[1].setNickName("J_Quasi");
		warriors[2].setNickName("E_Smalls");
		warriors[3].setNickName("Muensters");
		warriors[4].setNickName("Tone_Locc");
		
		for(int x=0; x <5; x++)
		{
			warriors[x].getDamage();
		}
		
		System.out.println("\nBut here, are the updated versions of the five warrior characters: ");
		for(int x=0; x < 5; x++)
		{
			
			warriors[x].printInfo();
		}
		
	}

}
