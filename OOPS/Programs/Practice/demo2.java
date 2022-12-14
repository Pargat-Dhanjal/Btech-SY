import java.util.*; 
class demo2 { 
    public static void main(String[] args) 
    { 
        Vector v = new Vector(20); 
        v.addElement("Geeksforgeeks"); 
        v.insertElementAt("Java", 2); 
        System.out.println(v.firstElement()); 
    } 
} 
