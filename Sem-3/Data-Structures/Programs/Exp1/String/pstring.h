#ifndef RATIONALCLASS_H
#define RATIONALCLASS_H
#include <stdbool.h>
class pstring
{
public:
    // Constructors
    pstring(void);
    pstring(char *s);

    // String Functions
    int length(void);
    void concat(pstring s1, pstring s2);
    void copy(pstring s);
    bool compare(pstring s);

    // display
    void display(void);
    // Read
    void Read(void);
    // Setter
    void Set(char *s, int len);

private:
    char str[1000];
    int len;
};
#endif