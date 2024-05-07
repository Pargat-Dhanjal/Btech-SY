//Accessing variables using super keyword
class Super_Variable 
{
	int b=30; 
}
class SuperClass extends Super_Variable 
{
	int b=12;
	void show()
	{
	System.out.println("subclass class variable: "+ b);
	System.out.println("superclass instance variable: "+ super.b);
	}
}
class SuperDemo2
{
	public static void main (String args[])
               {
	SuperClass s=new SuperClass();
	s.show(); // call to show method of Sub Class B
	}
}


