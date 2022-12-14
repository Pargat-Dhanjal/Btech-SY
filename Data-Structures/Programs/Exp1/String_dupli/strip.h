#ifndef STRIPCLASS_H
#define STRIPCLASS_H
class strip{
public:
    strip(void);
    strip(char *ss);
    void set(char *ss, int len);
    void printstrip(void);
    int len(void);
    void userInput(void);
    void cpy(strip ss);
private:
    char s[50];
    int l;
};
#endif