//Jonathan Rumley
//CSC 160_401
//4/10/2020
//Classwork 9-Stock Object
//Assistance from Tracy Dobbs

public class Stock 
{

//Data fields
	private String symbol = "";
	private String name = "";
	private double previousClosingPrice; 			//stores the stock price for previous day
	private double currentPrice; 					//stores the stock price for the current time
	
//Construct a stock object
	public Stock(String s, String n)
	{
		symbol = s;
		name = n;
	}

//Method returns the % changed from previousClosingPrice to currentPrice	
	public double getChangePercent()
	{
		double percentChange;
		if(previousClosingPrice != 0.0) //division by 0 = no bueno
			percentChange = (currentPrice - previousClosingPrice) / previousClosingPrice;
		else
			percentChange =0;
		percentChange *= 100; //convert double to percentage
		return percentChange;
	}
	
	public void setPreviousClosingPrice(double p)
	{
		previousClosingPrice = p;
	}
	public void setCurrentPrice(double c)
	{
		currentPrice = c;
	}

}
