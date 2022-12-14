//Tight Coupling

class A
{
public String name; 	//public data member of A class


public String getName()
{
	if(name!=null)  //Checking a valid access of instance variable, "name"
		return name;
	else
		return "not initiliazed";
}


public void setName(String s)
{
	if (s==null)  //Checking a valid setting of instance variable, "name"
		System.out.println("You can't initialized name to a null");
	else 
		name = s;
}
} 



class B
{
public static void main(String args[])
{
	//Creating an object of class A
	A ob = new A();

	//Directly setting the value of data member "name" of class A, due to tight coupling between the class A and B
	ob.name=null;  

	//Direct access of data member "name" of class A, due to tight coupling between two classes
	System.out.println("Name is " + ob.name); 	  
}
}

//Loose coupling
/*
class A
{
private String name;	//data member "name" is declared private to implement loose coupling.


public String getName()
{
	if(name!=null)	//Checking a valid access to data member, name
		return name;
	else
		return "not initiaized";
}

public void setName(String s)
{
	if (s==null)	//Checking a valid setting of data member, name
		System.out.println("You can't initialize name to a null");
	else 
		name = s;
}
}


class B
{
public static void main(String args[])
{
	//Creating an object of class AA
	A ob= new A();

	//Calling setter method, as the direct access of "name" is not possible i.e. loose coupling between classes
	ob.setName(null);

	//Calling getter method, as the direct access of "name" is not possible i.e. loose coupling
	System.out.println("Name is " + ob.getName()); 	  
}
}
*/