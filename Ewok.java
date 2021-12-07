class Ewok 
{
  private String name = "UghUgh";
  private int age = 0;
  
  public void MakeNoise()
  {
    System.out.println("Chhrrrrr");
  }
  
  public void printInfo()
  {
    System.out.println("\nMy name is: " + name);
    System.out.println("I am " + age + " years old");
  }
  
  public void setName(String n)
  {
    name = n;
  }
  
  public String getName()
  {
    return name;
  }
  
  public void setAge(int a)
  {
    age = a;
  }
  
  public int getAge()
  {
    return age;
  }
}
