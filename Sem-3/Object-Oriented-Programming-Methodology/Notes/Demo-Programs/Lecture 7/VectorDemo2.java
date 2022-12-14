import java.io.*;
import java.util.*;

class VectorDemo2 {
  public static void main (String[] args)
  {
    int n =5;
    Vector <Integer> v = new Vector<Integer> (n);
   for (int i = 1; i<=n; i++)
    v.add(i);
    v.add(9);
System.out.println(v);
}
}