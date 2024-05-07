class SortArray {

    void Sort(int list[]){

        int n=list.length;

        for (int i=0;i<n-1;i++){

            int min=i;                   

            for (int j = i+1;j<n;j++){

                if(list[j]<list[min]){

                    min=j;

                }

            }

            //swap the values

            int temp=list[min];

            list[min]=list[i];

            list[i]=temp;

        }

    }

    void printArray(int list[])

    {

        int n = list.length;

        for (int i=0; i<n; ++i)

            System.out.print(list[i]+" ");

    }




    public static void main(String[] args) {

               int list[]= {63,74,80,21,55};
               SortArray s1 = new SortArray();
               System.out.print("\n");
               System.out.println("Unsorted array");
               s1.printArray(list);
               s1.Sort(list);
               System.out.print("\n");
               System.out.println("Sorted array"); 
               s1.printArray(list);

    }

}

