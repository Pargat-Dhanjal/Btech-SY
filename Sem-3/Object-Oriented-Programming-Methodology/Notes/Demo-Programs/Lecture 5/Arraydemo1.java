class Arraydemo1{

public static void main (String args[])
{
   int [] marks = {10,20,30,40};
  for(int i=0;i<marks.length;i++)
   System.out.println(marks[i]+ " ");
      modify(marks);
for(int i=0;i<marks.length;i++)
   System.out.println(marks[i]+ " ");
}
static void modify(int [] m)
{
   for(int i=0;i<m.length;i++)
   m[i]=m[i] * 2;
}
}