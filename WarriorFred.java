//Updated for Classwork 10 - Warrior Arrays
// 

public class WarriorFred 
{
//The "-" equals private in UML
	private String nickName = "Fred";
	private int lifeForce = 10;
	private int damage = (int)(Math.random() * 10 + 1); //changed from 0**************************
	private String armory [] = {"Pumpkin", "Candy Corn","Peeps"};
	
//The "+" equals public in UML
	public void printInfo()//added***************************************
	{
		System.out.println("\nWarrior name: " + nickName +"\nWarrior damage: " + damage);
	}
	
	public void setNickName(String n)
	{
		nickName = n;
	}
	
	public String getNickName()
	{
		return nickName;
	}
	
	public int getDamage() //added*******************************************
	{
		return damage;
	}
	public void takeDamage(int d)
	{
		damage += d;
		reaction();
		if(damage >= 10)
		{
			lifeForce--;
			damage = 0;
		}
	}
	public void reaction()
	{
		String[] sounds = {"Ow!","POW!","Boffo!!","KaPow"};
		int r = (int)(Math.random()*sounds.length);
		System.out.println(sounds[r]); //Prints a random sound
	}
	public void reSpawn()
	{
		lifeForce = 10;
		damage = 0;
	}
	public boolean isAlive()
	{
		if(lifeForce > 0) return true;
		else return false;
	}
	public boolean isDead()
	{
		if(lifeForce < 1) return true;
		else return false;
	}
	
	
	
	
	
	@Override
	public String toString()
	{
		String returnString = "";
		returnString += "Nickname: " + nickName + "\n";
		returnString += "Lifeforce: " + lifeForce + "\n";
		returnString += "Damage: " + damage + "\n";
		
		return returnString;
	}	
}
