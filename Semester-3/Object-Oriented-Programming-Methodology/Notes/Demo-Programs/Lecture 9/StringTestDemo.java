class StringTestDemo{
 public static void main (String args[])
{
   String a ="Hello";
    String b="Hello";
    String g = new String(b);

    String c= new String("Hello");
   String d = new String("Hello");
    String e= new String("Hello World");
    String f = new String(e);

if(a==b)
System.out.println("Same location");
else
System.out.println("Different location");

if(b==g)
System.out.println("Same location");
else
System.out.println("Different location");

if(a==c)
System.out.println("Same location");
else
System.out.println("Different location");

if(c==d)
System.out.println("Same location");
else
System.out.println("Different location"); 

if(d==e)
System.out.println("Same location");
else
System.out.println("Different location");

if(e==f)
System.out.println("Same location");
else
System.out.println("Different location");
}
}