#include <bits/stdc++.h>
using namespace std;
int findbit(int m,int q){
    m=max(abs(m),abs(q));
    for(q=0;pow(2,q)<m;q++);
    return (max((q+1),4));
}
int* binary(int a,int num){
    int* ptr=(int*)malloc(num*sizeof(int));
    int acopy=abs(a),check=1;
    for (int i = 0;i<num; i++){
        ptr[i] = acopy % 2;
        acopy = acopy/2;
    }
    if (a < 0){
        for (int i = 0; i <num; i++){
            if (ptr[i] == 1 && check==1)
                check=0;
            else if(ptr[i] == 1 && check==0)
                ptr[i]=0;
            else if(ptr[i] == 0 && check==0)
                ptr[i]=1;
        }
    }
    return ptr;
}
void printbinary(int* ans,string s,int num){
    for(int i=2*num;i>num;i--)
        cout<<ans[i]<<" ";
    cout<<"\t";
    for(int i=num;i>0;i--)
        cout<<ans[i]<<" ";
    cout<<"\t"<<ans[0]<<"\t"<<s<<endl;
}
void binaryadd(int* ans,int* n,int num){
    int carry=0;
    for(int i=num+1;i<=2*num;i++){
        if(ans[i]+n[i-num-1]+carry==1){
            ans[i]=1;
            carry=0;
        }
        else if(ans[i]+n[i-num-1]+carry==2){
            ans[i]=0;
            carry=1;
        }
        else if(ans[i]+n[i-num-1]+carry==3){
            ans[i]=1;
            carry=1;
        }
    }
}
int main()
{
    int m,q;
    cout<<"Enter M and Q: ";
    cin>>m>>q;
    int num=findbit(m,q);
    cout<<endl;
    int ans[2*num+1]={0};
    int *arr=binary(q,num);
    for(int i=num;i>0;i--)
        ans[i]=arr[i-1];
    cout<<endl<<"A\t\tQ\t\tQ-1\t\tOperation"<<endl<<endl;
    printbinary(ans,"Initial Value",num);
    for(int i=0;i<num;i++){
        if(ans[1]==0 && ans[0]==1){
            binaryadd(ans,binary(m,num),num);
            printbinary(ans,"A <- A + M",num);
        }
        else if(ans[1]==1 && ans[0]==0){
            binaryadd(ans,binary(-m,num),num);
            printbinary(ans,"A <- A - M",num);
        }
        for(int i=0;i<2*num;i++)
            ans[i]=ans[i+1]; // Right Shifting
        printbinary(ans,"Arithemetic Right Shift",num);
    }
    printbinary(ans,"Final Answer",num);
}