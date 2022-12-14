import java.util.*;
public class ArrayList1 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> snames=new ArrayList<String> ();
        
               
       System.out.println("How many values do you want to enter : ");
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Enter Data");
            String x = sc.next();
            snames.add(i,x);
        }
        System.out.println("Contents : " );
        for (int i = 0; i < snames.size(); i++) {
          System.out.println(snames.get(i));
       }
    }
}