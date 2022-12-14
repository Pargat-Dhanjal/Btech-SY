#include <bits/stdc++.h>
using namespace std;
int findbit(int m,int q){
    m=max(abs(m),abs(q));
    for(q=0;pow(2,q)<m;q++);
    return (max((q),4));
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
    for(int i=(2*num)-1;i>num-1;i--)
        cout<<ans[i]<<" ";
    cout<<"\t";
    for(int i=num-1;i>=0;i--)
        cout<<ans[i]<<" ";
    cout<<"\t"<<s<<endl;
}
void binaryadd(int* ans,int* n,int num){
    int carry=0;
    for(int i=num;i<2*num;i++){
        if(ans[i]+n[i-num]+carry==1){
            ans[i]=1;
            carry=0;
        }
        else if(ans[i]+n[i-num]+carry==2){
            ans[i]=0;
            carry=1;
        }
        else if(ans[i]+n[i-num]+carry==3){
            ans[i]=1;
            carry=1;
        }
    }
}
int main()
{
    int m,q;
    cout<<"Enter Q and M: ";
    cin>>q>>m;
    int num=findbit(m,q);
    int ans[2*num]={0};
    int *arr=binary(q,num);
    for(int i=num-1;i>=0;i--)
        ans[i]=arr[i];
    cout<<endl<<"A\t\tQ\t\tOperation"<<endl<<endl;
    printbinary(ans,"Initial Value",num);
    for(int i=0;i<num;i++){
        for(int i=2*num;i>0;i--)
            ans[i]=ans[i-1]; // left Shifting
        ans[0]=8;
        printbinary(ans,"Arithemetic Shift Left",num);
        binaryadd(ans,binary(-m,num),num);
        printbinary(ans,"A <- A - M",num);
        if(ans[2*num-1]==1){
            binaryadd(ans,binary(m,num),num);
            printbinary(ans,"A <- A + M",num);
            ans[0]=0;
        }
        else 
            ans[0]=1;
    }
    printbinary(ans,"Final Answer",num);
}