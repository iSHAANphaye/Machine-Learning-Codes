#include<stdio.h>
int main()
{
    int a,b,c,hcf;
    printf("Enter any 2 numbers: \n");
    scanf("%d %d",&a,&b);
    a=(a>0)?a:-a;
    b=(b>0)?b:-b;
    for(c=1;c<=a && c<=b;c++)
    {
        if(a%c==0 && b%c==0)
        hcf=c;
    }
    printf("HCF of %d and %d is: %d",a,b,hcf);
}