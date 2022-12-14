//Constructors of super class
class Constructor_A 
{
	Constructor_A()
	{	
	System.out.println("Constructor A");
	}
}
class Constructor_B extends Constructor_A 
{
	Constructor_B()
	{
	System.out.println("Constructor B");
	}
}
class Constructor_C extends Constructor_B
 {
	Constructor_C()
	{
	System.out.println("Constructor C");
	}
}
class SuperDemo3
{
	public static void main (String args[]) 
{
	Constructor_C a=new Constructor_C();
	}
}
