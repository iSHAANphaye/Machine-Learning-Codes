#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter any year: \n");
    scanf("%d",&a);
    if(a%400==0)
    printf("Hurrah! It's a leap year.");
    else if(a%100==0)
    {
        printf("Bad luck...");
    }
    else if(a%4==0)
    {
        printf("Hurrah! It's a leap year.");
    }
    else
    {
        printf("Bad luck...");
    }
    
}