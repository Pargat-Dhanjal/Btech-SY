class CallReference{

Integer value;
  
CallReference(Integer value)
{
this.value = value;
}
public String toString()
{
 return String.valueOf(value);
}
}
class WrapperDemo4{
public static void main(String[] args)
{
   CallReference k = new CallReference(50);
  System.out.println("Before modify"); 
  System.out.println(k);
   System.out.println("After modify"); 
   modify(k);
   System.out.println(k);
 }
 static void modify(CallReference x)
{
   x.value = x.value+50;
}
}


