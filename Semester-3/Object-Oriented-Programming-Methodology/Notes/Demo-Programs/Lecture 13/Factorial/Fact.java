package Factorial;
public class Fact
{
   public int fact(int a)
  {
     if(a==1)
       return 1;
     else
       return a*fact(a-1);
    }
}