class WrapperExample3{
public static void main (String args[])
{
   byte b = 10;
   short s = 20;
   int i = 30;
   long l = 40;
   float f = 50.0F;
   double d = 60.0D;
   char c = 'a';
   boolean b1 = true;

//Autoboxing

Byte byteobj = b;
Short shortobj = s;
Integer intobj = i;
Long longobj = l;
Float floatobj = f;
Double doubleobj = d;
Character charobj = c;
Boolean boolobj = b1;

//Printing object values 
System.out.println("Byte: "+byteobj);
System.out.println("Short: "+shortobj);
System.out.println("Integer: "+intobj);


//Unboxing
byte bytevalue = byteobj; 
short shortvalue = shortobj;
int intvalue = intobj;

//Printing primitives
System.out.println("\n");
System.out.println("byte value: "+bytevalue);
System.out.println("short value: "+shortvalue);
System.out.println("int value: "+intvalue);
}
}
 

