class CallValue{

int value;
  
CallValue(int value)
{
this.value = value;
}

}
class WrapperDemo5{
public static void main(String[] args)
{
   CallValue k = new CallValue(50);
   System.out.println(k.value);
   modify(k.value);
   System.out.println(k.value);
 }
 static void modify(int value)
{
  value = value+100;
  System.out.println(value);
}
}