// Java program to demonstrate Wrapping and UnWrapping
// in Java Classes
class WrappingUnwrapping
{
    public static void main(String args[])
    {
        //  byte data type
        byte a = 1;
 
        // wrapping around Byte object
        Byte byteobj = new Byte(a);
 
        // int data type
        int b = 10;
 
        //wrapping around Integer object
        Integer intobj = new Integer(b);
 
        // float data type
        float c = 18.6f;
 
        // wrapping around Float object
        Float floatobj = new Float(c);
 
        // double data type
        double d = 250.5;
 
        // Wrapping around Double object
        Double doubleobj = new Double(d);
 
        // char data type
        char e='a';
 
        // wrapping around Character object
        Character charobj=e;
 
        //  printing the values from objects
        System.out.println("Values of Wrapper objects (printing as objects)");
        System.out.println("Byte object byteobj:  " + byteobj);
        System.out.println("Integer object intobj:  " + intobj);
        System.out.println("Float object floatobj:  " + floatobj);
        System.out.println("Double object doubleobj:  " + doubleobj);
        System.out.println("Character object charobj:  " + charobj);
 
        // objects to data types (retrieving data types from objects)
        // unwrapping objects to primitive data types
        byte bv = byteobj;
        int iv = intobj;
        float fv = floatobj;
        double dv = doubleobj;
        char cv = charobj;
 
        // printing the values from data types
        System.out.println();
        System.out.println("Unwrapped values (printing as data types)");
        System.out.println("byte value, bv: " + bv);
        System.out.println("int value, iv: " + iv);
        System.out.println("float value, fv: " + fv);
        System.out.println("double value, dv: " + dv);
        System.out.println("char value, cv: " + cv);
    }
}