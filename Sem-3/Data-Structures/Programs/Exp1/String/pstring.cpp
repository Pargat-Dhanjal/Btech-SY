#include <bits/stdc++.h>
#include "pstring.h"
using namespace std;
// Constructors
pstring::pstring(void){
    char temp[1000];
    Set(temp,0);
}

pstring::pstring(char* s){
    int c=0;
    while(str[c]!='\0')
        c++;
    Set(s,c);
}

// Setter
void pstring::Set(char* s,int l){
    for(int i=0;i<l;i++)
    str[i]=s[i];
    len=l;
}

// length
int pstring::length(){
    return len;
}

// Concatenate
void pstring::concat(pstring s1,pstring s2){
    char temp[s1.len+s2.len];
    for(int i=0;i<s1.len;i++)
        temp[i]=s1.str[i];
    for(int i=s1.len;i<s1.len+s2.len;i++)
        temp[i]=s2.str[i-s1.len];
    Set(temp,s1.len+s2.len);
}

// Copy
void pstring::copy(pstring s1){
    Set(s1.str,s1.len);
}

bool pstring::compare(pstring s1){
    if(len==s1.len)
    {
        for(int i=0;i<len;i++)
            if(s1.str[i]!=str[i])
                return false;
        return true;

    }
    return false;
}

// Display
void pstring::display(void){
    for(int i=0;i<len;i++)
        cout<<str[i];
}

// Read
void pstring::Read(void){
    char temp[1000];
    cin>>temp;
    int c=0;
    while(temp[c]!='\0')
        c++;
    Set(temp,c);
}