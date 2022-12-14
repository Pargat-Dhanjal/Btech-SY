#include <bits/stdc++.h>
#include "pstring.h"
#include "pstring.cpp"
using namespace std;

int main(void) {

pstring str1,str2,str3,str4;

cout << "Enter String1: ";
str1.Read();
cout << "Enter String2: ";
str2.Read();

str1.display();
cout<<" length is "<<str1.length()<<endl;
str2.display();
cout<<" length is "<<str2.length()<<endl;

str3.concat(str1,str2);
cout<<"The concatenation is: ";
str3.display();
cout<<endl;

str4.copy(str1);
cout<<"Copied String1 To String4: ";
str4.display();
cout<<endl;

cout<<"Comparing String1 and String4"<<endl;
if(str1.compare(str4))
    cout<<"The are equal"<<endl;
else
    cout<<"They are not equal"<<endl;
cout<<"Comparing String2 and String4"<<endl;
if(str2.compare(str4))
    cout<<"The are equal"<<endl;
else
    cout<<"They are not equal"<<endl;
return(0);
}