#include <bits/stdc++.h>
#include "rationalclass.h"
using namespace std;
// Constructors
rational::rational(void)
{

    Set(0, 1);
}

rational::rational(int N, int D)
{

    Set(N, D);
}
// Set the value. Fails if D is not natural
bool rational::Set(int N, int D)
{

    if (D >= 1)
    {
        Numerator = N;
        Denominator = D;
        return (true);
    }
    else
        return (false);
}

// Add
rational rational::Add(rational OtherOne)
{

    rational Answer;

    Answer.Set(Numerator * OtherOne.Denominator + Denominator * OtherOne.Numerator,
               Denominator * OtherOne.Denominator);

    return (Answer);
}
// Substraction
rational rational::Subtract(rational OtherOne)
{

    rational Answer;

    Answer.Set(Numerator * OtherOne.Denominator - Denominator * OtherOne.Numerator,
               Denominator * OtherOne.Denominator);

    return (Answer);
}
// Multiplication
rational rational::Multiply(rational OtherOne)
{

    rational Answer;
    Answer.Set(Numerator * OtherOne.Numerator,
               Denominator * OtherOne.Denominator);
    return (Answer);
}
// Division
rational rational::Divide(rational OtherOne)
{

    rational Answer;
    Answer.Set(Numerator * OtherOne.Denominator,
               Denominator * OtherOne.Numerator);
    return (Answer);
}
// Read. Fails if D is not natural
bool rational::Read(void)
{

    int NewNumerator,
        NewDenominator;

    cin >> NewNumerator >> NewDenominator;

    return (Set(NewNumerator, NewDenominator));
}
// Write
void rational::Write(void)
{
    int gcd = __gcd(Numerator, Denominator);
    cout << Numerator / gcd << "/" << Denominator / gcd;
}