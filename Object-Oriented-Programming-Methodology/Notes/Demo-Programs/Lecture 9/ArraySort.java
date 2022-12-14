import java.util.*;
public class ArraySort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> snames=new ArrayList<Integer> ();
        
               
       System.out.println("How many values do you want to enter : ");
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Enter Data");
            Integer x = sc.nextInt();
            snames.add(i,x);
        }
        Collections.sort(snames);
        System.out.println("Contents : " );
        for (int i = 0; i < snames.size(); i++) {
          System.out.println(snames.get(i));
       }
    }
}