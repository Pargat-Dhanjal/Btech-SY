#include <bits/stdc++.h>
using namespace std;

int main()
{
    int memory_lines, blocks;
    cout << "Enter number of main memory lines:";
    cin >> memory_lines;
    cout << "Enter number of blocks in the main memory:";
    cin >> blocks;
    int bmemory[blocks][4];
    int mmemory[memory_lines];
    cout << "\nEnter the main memory data:" << endl;
    for (int i = 0; i < memory_lines; i++)
    {
        cout << "Line no. " << i + 1 << ": ";
        cin >> mmemory[i];
    }
    int k = 0;

    for (int i = 0; i < blocks; i++)
        for (int j = 0; j < 4; j++)
            bmemory[i][j] = mmemory[k++];
    cout << "\nDirect mapped cache\n";
    for (int i = 0; i < blocks; i++)
    {
        cout << endl
             << "Block " << i << ": ";
        for (int j = 0; j < 4; j++)
            cout << bmemory[i][j] << " ";
    }
    cout << "\n\nSample cache:\n";
    for (int i = 0; i < blocks; i++)
    {
        int random = rand() % 5;
        cout << bmemory[i][random] << " ";
    }
}
