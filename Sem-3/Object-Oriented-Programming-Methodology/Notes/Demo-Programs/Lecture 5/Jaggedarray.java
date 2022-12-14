class Jaggedarray
{
   public static void main(String args[])
   {
     int [] [] a = new int [3] [];
     a[0]= new int [4];
     a[1]= new int [3];
     a[2]= new int [2];

    a[0][0]=7;a[0][1]=6;a[0][2]=5;a[0][3]=4;
    a[1][0]=3;a[1][1]=2; a[1][2]=1;
    a[2][0]=8; a[2][1]=9;

    for(int i=0;i<a.length;i++)
    {
       for(int j=0;j<a[i].length;j++)
           System.out.print(a[i][j] + " ");
       System.out.println( );
   }
    }
}


   



