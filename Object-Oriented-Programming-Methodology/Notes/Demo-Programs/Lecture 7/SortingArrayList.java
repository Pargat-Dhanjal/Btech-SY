import java.util.*;

class SortingArrayList{
public static void main(String[] args)
{
  ArrayList <String> v = new ArrayList<String> ();

   v.add("4");
   v.add("5");
   v.add("9");
   v.add("6");
   v.add("2");

  System.out.println("\nOriginal ArrayList: " + v);
 
  Collections.sort(v);
 
  System.out.println("\nSorted ArrayList: " + v);
}
}
 

