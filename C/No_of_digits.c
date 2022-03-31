#include<stdio.h>
int main()
{
    int a,b=0;
    printf("Enter any number: ");
    scanf("%d",&a);
    if(a<0)
    {
        a*=-1;
    }
    else if(a==0)
    {
        a=1;
    }
    while(a>0)
    {
        a=a/10;
        b++;
    }
    printf("Digits are %d",b);
}