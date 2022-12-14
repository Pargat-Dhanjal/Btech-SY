import java.util.*;
class Arraydemo{

public static void main(String args[]) {

        int arr[]=new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter 5 elements ");

        for(int i=0;i<arr.length;i++)

            arr[i]=sc.nextInt();
      //i=sc.nextInt();
 System.out.println("Unsorted List");
      for(int i: arr)
     System.out.print(i + " ");

       for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){

      if(arr[i] > arr[j])
      {
         int temp = arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
      } 
}
}
      System.out.print("\n");
      System.out.println("Sorted List");
      for(int i: arr)
     System.out.print(i + " ");

    }
}
