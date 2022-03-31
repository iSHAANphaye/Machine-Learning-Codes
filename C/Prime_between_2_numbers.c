#include<stdio.h>
int main()
{
    int a,b,c,d;
    printf("Enter the 2 intervals between which prime numbers will be shown: ");
    scanf("%d %d",&c,&d);
    for(a=c;a<d;a++)
    {
     for(b=2;b<=a;b++)
          {
                if(a%b==0)
            {
               printf("");
               break;
            }
          }
     if(a==b)
         {
             printf("%d ",a); 
         }     
    }
}