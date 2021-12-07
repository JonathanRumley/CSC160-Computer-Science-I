class EwokTesting 
{
  public static void main(String[] args) 
  {
    // This code creates an array of Ewoks
    
    Ewok[] ewoks = new Ewok[5];
    for(int x=0; x<5; x++)
    {
      ewoks[x] = new Ewok();
    }
    System.out.println("Starting condition of the 5 Ewoks:");
    for(int x=0; x<5; x++)
    {
      ewoks[x].printInfo();
    }
    ewoks[0].setName("Timmy");
    ewoks[1].setName("Iffy");
    ewoks[2].setName("Jimmy");
    ewoks[3].setName("Bill");
    ewoks[4].setName("Ewokian");
    
    for(int x=0; x<5; x++)
    {
      int randomAge = (int)(Math.random() * 100);
      ewoks[x].setAge(randomAge);
    }
    
    System.out.println("\n\nCondition of the 5 Ewoks after changes:");
    for(int x=0; x<5; x++)
    {
      ewoks[x].printInfo();
    }
  }
}