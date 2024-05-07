#include <bits/stdc++.h>
using namespace std;
int main()
{
    int digit1[]={1,1,0,1},digit2[]={0,1,0,1};
    int sum[4];
    int carry=0;
    for(int i=3;i>=0;i--){
        if(digit1[i]+digit2[i]+carry==1)
        {
            carry=0;
            sum[i]=1;
        }
    else if(digit1[i]+digit2[i]+carry==2){
        carry=1;
        sum[i]=0;
    }
    else if(digit1[i]+digit2[i]+carry>2){
        carry=1;
        sum[i]=1;
    }
    else
        sum[i]=0;
    }
    for(int i=0;i<4;i++)
    cout<<sum[i]<<" ";
    cout<<endl;
    return 0;
}
// 0 0 1 0 1 1 1 0 