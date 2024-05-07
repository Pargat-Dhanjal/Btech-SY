#ifndef RATIONALCLASS_H
#define RATIONALCLASS_H
#include <stdbool.h>

class rational
{

public:
    // Constructors
    rational(void);

    rational(int N, int D);

    // Set the value. Fails if D is not natural
    bool Set(int N, int D);

    // Functions
    rational Add(rational OtherOne);
    rational Subtract(rational OtherOne);
    rational Multiply(rational OtherOne);
    rational Divide(rational OtherOne);
    rational Simplify();

    // Read. Fails if D is not natural
    bool Read(void);

    // Write
    void Write(void);

private:
    int Numerator,
        Denominator;
};
#endif