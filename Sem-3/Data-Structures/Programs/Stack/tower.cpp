#include <bits/stdc++.h>
using namespace std;
void tower(int num,int src,int btw,int des){
    if(num > 0){
        tower(num-1,src,des,btw);
        cout<<src<<"-"<<des<<endl;
        tower(num-1,btw,src,des);
    }
}
int main()
{
    int n;
    cout<<"Enter the number of disks: ";
    cin>>n;
    tower(n,1,2,3);
    return 0;
}