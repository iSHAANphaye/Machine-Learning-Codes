#include<stdio.h>
int main()
{
    int a,b,first=0,second=1,d;
    printf("Enter the number of terms of fibonacci series: ");
    scanf("%d",&a);
   for(b=0;b<a;b++)
   {
     printf("%d ",first);
     d=first+second;
     first=second;
     second=d;
   }
}