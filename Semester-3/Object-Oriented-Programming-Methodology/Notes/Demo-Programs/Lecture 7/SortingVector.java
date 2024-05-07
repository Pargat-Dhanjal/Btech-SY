import java.util.*;

class SortingVector{
public static void main(String[] args)
{
  Vector <String> v = new Vector<String> ();

   v.addElement("4");
   v.addElement("5");
   v.addElement("9");
   v.addElement("6");
   v.addElement("2");

  System.out.println("\nOriginal vector: " + v);
 
  Collections.sort(v);
 
  System.out.println("\nSorted vector: " + v);
}
}
 

