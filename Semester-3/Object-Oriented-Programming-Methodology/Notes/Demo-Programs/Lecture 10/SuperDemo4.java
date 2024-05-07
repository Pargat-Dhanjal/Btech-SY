//Constructors of super class
class Constructor_A_Revised
 {
	Constructor_A_Revised()
	{
		System.out.println("Constructor A Revised");
	}
}
class Constructor_B_Revised extends Constructor_A_Revised 
{
	/*Constructor_B_Revised()
	{
		System.out.println("Constructor B");
	}*/
	Constructor_B_Revised(int a)
	{
	  a++;
	  System.out.println("Constructor B Revised "+ a );
	}
}
class Constructor_C_Revised extends Constructor_B_Revised
 {
	Constructor_C_Revised()
	{
		super(11); // if omitted compile time error results
		System.out.println("Constructor C Revised");
	}
}
class SuperDemo4
{
	public static void main (String args[])
                {
	 Constructor_C_Revised p=new Constructor_C_Revised();
	}
}

