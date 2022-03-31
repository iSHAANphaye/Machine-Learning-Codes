#include<stdio.h>
#include<math.h>
int main()
{
   int a,b,d,e=0,f;
   float c=0.0;
   printf("Enter any number: ");
   scanf("%d",&a);
   d=a;
   f=a;
   while(a>0)
   {
      a=a/10;
      e++;
   }
   while(f!=0)
   {
      b=f%10;
      c+=pow(b,e);
      f=f/10;
   }
   if((int)c==d)
   printf("It is an Armstrong number.");
   else
   {
      printf("Try again!");
   }  
}