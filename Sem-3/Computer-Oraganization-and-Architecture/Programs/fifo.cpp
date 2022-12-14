#include <bits/stdc++.h>
using namespace std;
int c;
void fifo(string st)
{
    int arr[c], hit = 0, k = 0;
    bool p = 0;
    for (int i = 0; i < c; i++)
        arr[i] = -1;
        
    for (int i = 0; i < st.length(); i++)
    {
        if (k < c)
        {
            int ele = int(st[i] - '0');
            for (int j = 0; j < c; j++)
            {
                if (arr[j] == ele)
                {
                    p = 1;
                    break;
                }
            }
            if (p)
            {
                hit++;
                p = 0;
                continue;
            }
            else
            {
                arr[k] = ele;
                k = ++k % c;
            }
        }
        for (int j = 0; j < c; j++)
        {
            if (arr[j] != -1)
                cout << arr[j] << " ";
            else
                cout << "- ";
        }
        cout << endl;
    }
    cout << "The hit ratio:" << hit << "/" << st.length() << endl;
}
int main()
{
    string str;
    cout << "Enter the number of page frames: ";
    cin >> c;
    cout << "Enter string: ";
    cin >> str;
    fifo(str);
}