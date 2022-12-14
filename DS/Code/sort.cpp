#include <bits/stdc++.h>
using namespace std;
void bubbleSort(int *arr, int n)
{
    for (int i = n - 1; i >= 0; i--)
    {
        for (int j = 0; j < i; j++)
        {
            // comparing the two elements and swaping if greater
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
void insertionSort(int *arr, int n)
{
    int j;
    for (int i = 1; i < n; i++)
    {
        int key = arr[i];
        j = i - 1;
        // This shifts elements till they are > key
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
void countingSort(int a[], int n) // function to perform counting sort
{
    int max = a[0];
    // Max
    for(int i=1;i<n;i++)
        if(max<a[i])
            max=a[i];
    int count[max + 1];
    int output[n + 1];
    // Initialize with 0
    for (int i = 0; i <= max; ++i)
        count[i] = 0;
    // Hashing
    for (int i = 0; i < n; i++)
        count[a[i]]++;
    // Adding count values 
    for (int i = 1; i <= max; i++)
        count[i] += count[i - 1];
    // Making sorted array
    for (int i = n - 1; i >= 0; i--)
    {
        output[count[a[i]] - 1] = a[i];
        count[a[i]]--; 
    }
    // copy
    for (int i = 0; i < n; i++)
        a[i] = output[i]; 
}
int main()
{
    int arr[]={10,9,8,7,6,5,4,3,2,1};
    cout<<"Sorting using Bubble Sort"<<endl;
    bubbleSort(arr,10);
    for (int i = 0; i < 10; i++)
        cout << arr[i] << endl;
    cout<<"Sorting using Insertion Sort"<<endl;
    insertionSort(arr,10);
    for (int i = 0; i < 10; i++)
        cout << arr[i] << endl;
        cout<<"Sorting using Counting Sort"<<endl;
    countingSort(arr,10);
    for (int i = 0; i < 10; i++)
        cout << arr[i] << endl;
    return 0;
}