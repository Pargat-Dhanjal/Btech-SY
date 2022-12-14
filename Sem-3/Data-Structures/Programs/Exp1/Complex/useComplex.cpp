#include <bits/stdc++.h>
#include "compnumclass.h"
#include "compnumclass.cpp"
using namespace std;
int main(void)
{
    compnum N1, N2, Sum, Multi, Sub, Divide;

    cout << "Enter Real and Imaginary for new N1 : ";
    if (!N1.Read())
        cout << "Something went wrong" << endl;
    cout << "Enter Real and Imaginary for new N2 : ";
    if (!N2.Read())
        cout << "Something went wrong" << endl;

    cout << "N1 is ";
    N1.Write();
    cout << "N2 is ";
    N2.Write();
    cout << endl;

    Sum = N1.Add(N2);
    cout << "Sum is ";
    Sum.Write();
    cout << endl;

    Sub = N1.Subtract(N2);
    cout << "Subtraction is ";
    Sub.Write();
    cout << endl;

    Multi = N1.Multiply(N2);
    cout << "Multiplication is ";
    Multi.Write();
    cout << endl;

    Divide = N1.Divide(N2);
    cout << "Division is ";
    Divide.Write();
    cout << endl;
    return (0);
}