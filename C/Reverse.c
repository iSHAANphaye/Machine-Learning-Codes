#include<stdio.h>
int main()
{
    int a,b,rev=0,n;
    printf("Enter any number: ");
    scanf("%d",&a);
    n=a;
    while(a>0)
    {
        b=a%10;
        rev=rev*10+b;
        a=a/10;
    }
    printf("The reverse of %d is: %d",n,rev);
}