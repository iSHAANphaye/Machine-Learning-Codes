#include<stdio.h>
int main()
{
    int a,b,c=1;
    printf("Enter any number to know its factorial: ");
    scanf("%d",&a);
    for(b=1;b<=a;b++)
    {
        c=c*b;
    }
    printf("%ld",c);
}