
public class TestingWarriorFred 
{

	public static void main(String[] args) 
	{
		WarriorFred wf1 = new WarriorFred();
		WarriorFred wf2 = new WarriorFred();
		
		System.out.println("Here is the first warrior's information: ");
		System.out.println((wf1.toString()));
		System.out.println("\nHere is the second warrior's information: ");
		System.out.println((wf2.toString()));
		
		System.out.println("\n");
		
		wf1.setNickName("J_Quasi");
		wf1.takeDamage(3);
		wf1.takeDamage(3);
		wf1.takeDamage(3);
		
		wf2.setNickName("Twisted_C");
		wf2.takeDamage(11);
		wf2.takeDamage(11);
		wf2.takeDamage(3);
		
		System.out.println("\n\nAfter a little bit of war activity .....");
		System.out.println("Here is the first warrior's information");
		System.out.println((wf1.toString()));
		System.out.println("\nHere is the second warrior's information: ");
		System.out.println((wf2.toString()));
		
		System.out.println("\n\nNickname of first warrior: " + wf1.getNickName());
		System.out.println("Nickname of second warrior: " + wf2.getNickName());
		
		wf1.printInfo();
		
		
	}

}
