#include <bits/stdc++.h>
#include "rationalclass.h"
#include "rationalclass.cpp"
using namespace std;
int main(void)
{

    rational R1,
        R2,
        Sum,
        Multi,
        Sub,
        Divide;

    cout << "Enter N and D for new R1 :";
    if (!R1.Read())
        cout << "Doh, must have a positive denominator" << endl;

    cout << "Enter N and D for new R2 :";
    if (!R2.Read())
        cout << "Doh, must have a positive denominator" << endl;

    cout << "R1 is ";
    R1.Write();
    cout << " and R2 is ";
    R2.Write();
    cout << endl;

    Sum = R1.Add(R2);
    cout << "Sum is ";
    Sum.Write();
    cout << endl;

    Sub = R1.Subtract(R2);
    cout << "Subtraction is ";
    Sub.Write();
    cout << endl;

    Multi = R1.Multiply(R2);
    cout << "Multiplication is ";
    Multi.Write();
    cout << endl;

    Divide = R1.Divide(R2);
    cout << "Division is ";
    Divide.Write();
    cout << endl;
    return (0);
}