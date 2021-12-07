//Jonathan Rumley
//CSC 160_401
//4/10/2020
//Classwork 9-Stock Object
//Assistance from Tracy Dobbs

public class TestingStock 
{

	public static void main(String[] args) 
	{
		Stock s = new Stock("ORCL","Oracle Corporation");
		s.setPreviousClosingPrice(34.5);
		s.setCurrentPrice(34.35);
		System.out.printf("%s%5.2f%%","Change Percentage: ",s.getChangePercent());
		


	}	

}
