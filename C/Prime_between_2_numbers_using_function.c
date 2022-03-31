#include<stdio.h>
int PrimeNo(int a, int b)
{
  int n,x;
  for(n=a;n<b;n++)
  {
      for(x=2;x<n;x++)
      {
          if(n%x==0)
          {
              printf("");
              break;
          }
      }
      if(n==x)
      {
          printf("%d ",x);
      }
  }
  return 0;
} 
int main()
{
    int p,q;
    printf("Enter any 2 numbers: ");
    scanf("%d %d",&p,&q);
    printf("The prime numbers between %d and %d are:\n",p,q);
    PrimeNo(p,q);
    return 0;
}
