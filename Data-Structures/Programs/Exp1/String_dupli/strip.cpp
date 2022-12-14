#include <iostream>
#include "strip.h"
using namespace std;
strip::strip(void){
    char temp[50];
    set(temp,0);
}
strip::strip(char* ss){
    int f=0;
    while(ss[f]!='\0')
        f++;
    set(ss,f);
}
int strip::len(){
    return l;
}
void strip::set(char* ss,int len){
    l=len;
    int i=0;
    while(i<len){
    s[i]=ss[i];
    i++;
    }
}
void strip::cpy(strip ss){
    set(ss.s,ss.l);
}
void strip::printstrip(){
    for(int i=0;i<l;i++)
        cout<<s[i];
}
void strip::userInput(void){
    char t[50];
    cin>>t;
    int k=0;
    while(t[k]!='\0')
        k++;
    set(t,k);
}