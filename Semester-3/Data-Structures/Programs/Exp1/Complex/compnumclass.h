#ifndef COMPNUMCLASS_H
#define COMPNUMCLASS_H
#include <stdbool.h>

class compnum
{

public:
    // Constructors
    compnum(void);
    compnum(double r, double i);

    // Set the value
    bool Set(double r, double i);

    // Functions
    compnum Add(compnum OtherOne);
    compnum Subtract(compnum OtherOne);
    compnum Multiply(compnum OtherOne);
    compnum Divide(compnum OtherOne);

    // Read
    bool Read(void);

    // Write
    void Write(void);

private:
    double real, img;
};
#endif