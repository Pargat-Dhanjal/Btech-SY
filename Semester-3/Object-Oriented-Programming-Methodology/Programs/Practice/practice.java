import java.util.*;
class practice {
    public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
            arr[i]=i;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int a=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=a;
                }
            }
        }
        for(int i: arr)
            System.out.println(i);
    }
}
// id shooping id name price 