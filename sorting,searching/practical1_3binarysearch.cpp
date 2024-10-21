#include<iostream>

using namespace std;
int main()
{
    int arr[11]={13,15,19,21,26,31,36,39,44,48,52};
    int l=0,r=11;
    int mid=0;
    cout<<"\n enter element you want to find out : \n ";
    int x;
    cin>>x;
    int count=0;
   while(l<=r)
   {
     count++;
    mid=(l+r)/2;
    if(arr[mid]>x)
    {
       
        r=mid -1;
    }
    else
    {
        l=mid +1;
    }
   }
    cout<<"your character's index is :"<<mid;
    cout<<endl<<count;

return 0;
}