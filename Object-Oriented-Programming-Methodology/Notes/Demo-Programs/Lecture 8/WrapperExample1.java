import java.util.*;
class WrapperExample1{
public static void main (String args[])
{
  Scanner sc=new Scanner(System.in);
  int a = 20;
Integer i = Integer.valueOf(a);//Explicitly
Integer j = sc.nextInt();
System.out.println(a+ " "+i+" "+j);
System.out.println(j);
}
}