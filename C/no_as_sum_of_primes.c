#include<stdio.h>
int main()
{
   int a,b,c,d,e,x;
   printf("Enter any integer: ");
   scanf("%d",&x);
   for(a=2;a<=x;a++)
   {
      c=x-a;
      e=c;
      for(b=2;b<a;b++)
          {
             if(a%b==0)
            {
               printf("");
               break;
            }
          }
     if(a==b)
         {
           printf("");
           for(d=2;d<c;d++)
           {
              if(c%d==0)
              {
                 printf("");
                 break;
              }
           }
           if(c==d)
           {
              printf("%d = %d + %d\n",x,a,e);
              printf("");
           }
         }  
         if(a>(x/2))
         {
            break;
         } 
   }
}