#include <bits/stdc++.h>
#include "compnumclass.h"
using namespace std;
// Constructors
compnum::compnum(void)
{
    Set(0, 0);
}

compnum::compnum(double r, double i)
{
    Set(r, i);
}
// Set the value. Fails if D is not natural
bool compnum::Set(double r, double i)
{
    real = r;
    img = i;
    return true;
}

// Add
compnum compnum::Add(compnum OtherOne)
{
    compnum Answer;
    Answer.Set(real + OtherOne.real, img + OtherOne.img);
    return (Answer);
}
// Substraction
compnum compnum::Subtract(compnum OtherOne)
{
    compnum Answer;
    Answer.Set(real - OtherOne.real, img - OtherOne.img);
    return (Answer);
}
// Multiplication
compnum compnum::Multiply(compnum OtherOne)
{
    compnum Answer;
    double tempr = (real * OtherOne.real) - (img * OtherOne.img);
    double tempi = (real * OtherOne.img) - (img * OtherOne.real);
    Answer.Set(tempr, tempi);
    return (Answer);
}
// Division
compnum compnum::Divide(compnum OtherOne)
{
    compnum Answer;
    double den = (OtherOne.real * OtherOne.real) + (OtherOne.img * OtherOne.img);
    double tempr = (real * OtherOne.real) + (img * OtherOne.img);
    double tempi = (img * OtherOne.real) - (real * OtherOne.img);
    Answer.Set(tempr / den, tempi / den);
    return (Answer);
}
// Read. Fails if D is not natural
bool compnum::Read(void)
{
    double tempr, tempi;
    cin >> tempr >> tempi;
    return (Set(tempr, tempi));
}
// Write
void compnum::Write(void)
{
    cout << endl
         << "Real Part is: " << real << " Imaginary Part is: " << img << "i" << endl;
}