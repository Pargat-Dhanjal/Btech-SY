#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int num = n;
    n = abs(n);
    int arr[8];
    for (int i = 7; i >= 0; i--)
    {
        if (n >= pow(2, i))
        {
            arr[7 - i] = 1;
            n = n - pow(2, i);
        }
        else
            arr[7 - i] = 0;
    }
    if (num < 0)
    {
        cout<<"Hey";
        for (int i = 7; i >= 0; i--)
        {
            if (arr[i] == 1)
                arr[i]=0;
            else
                arr[i]=1;
        }
    }
    for (int i = 0; i < 8; i++)
        cout << arr[i] << " ";
    cout << endl;
    return 0;
}