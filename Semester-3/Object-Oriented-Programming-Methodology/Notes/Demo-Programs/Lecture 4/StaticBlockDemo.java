class StaticBlockDemo {
    int x=10; 
//static block
    static 
{
    int z=10; // local variable
    System.out.println("In static block");
}
//Instance block
    {
    System.out.println("In Instance Initialization block");
    System.out.println("Printing Instance variable Initializer value through Block: " +x);
    }
 
    // Constructor
    StaticBlockDemo(int y) {
    System.out.println("Within Constructor");
    System.out.println("Instance variable printed using constructor: "+x);
     x=y;
     System.out.println("Instance variable initialized using constructor: "+x);
   }
    StaticBlockDemo() 
	{
     System.out.println("Within Constructor");
      System.out.println("Instance variable printed using  constructor: "+x);	}
      public static void main(String[] args)	{
      System.out.println("In main");
      StaticBlockDemo st = new StaticBlockDemo(100);
      System.out.println("-----------------------------------------   ");
      StaticBlockDemo st1 = new StaticBlockDemo();
       }
	}
