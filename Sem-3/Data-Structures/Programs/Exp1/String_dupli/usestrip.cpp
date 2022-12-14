#include <iostream>
#include "strip.cpp"
#include "strip.h"
using namespace std;
int main(void)
{
    strip s1, s2, s3, str4;
    cout << "Enter 1: ";
    s1.userInput();
    cout << "Enter 2: ";
    s2.userInput();
    s1.printstrip();
    cout << " length s1 " << s1.len() << endl;
    s2.printstrip();
    cout << " length s2 " << s2.len() << endl;
    cout << "copy s1 to s3: ";
    s3.cpy(s1);
    s3.printstrip();
    cout << endl;
    return (0);
}