#include<stdio.h>
#include<math.h>
int main()
{
   long long a;
   printf("Enter any binary number to convert it into decimal number: ");
   scanf("%lld",&a);
   printf("The number is %d",convert(a));
   return 0;
}
int convert(long long a)
{
   int b,c=0,d=0;
   while(a!=0)
   {
      b=a%10;
      a/=10;
      c+=b*pow(2,d);
      ++d;
   }
   return c;
}