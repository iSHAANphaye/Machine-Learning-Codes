#include<stdio.h>
int main()
{
    int a,b,c=0,d,e,num;
    printf("Enter any number: \n");
    scanf("%d",&a);
    num=a;
    while(a>0)
    {
        b=a%10;
        c=c*10+b;
        a=a/10;
    }
    if(c==num)
    {
        printf("The number is a palindrome.");
    }
    else
    {
        printf("Try again.");
    }
    
}