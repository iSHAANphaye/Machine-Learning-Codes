#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Type any number to know whether it is a prime number or not:\n");
    scanf("%d",&a);
    if(a==1)
    {
        printf("The number should be greater than 1.\n");
    }
    
     for(b=2;b<a;b++)
          {
                if(a%b==0)
            {
               printf("%d is not a Prime number",a);
               break;
            }
          }
     if(a==b)
         {
             printf("%d is a Prime Number.",a);
         }   
}