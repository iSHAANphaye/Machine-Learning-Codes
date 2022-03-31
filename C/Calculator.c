#include <stdio.h>
int main()
{
    char choice;
    int a,b,c;
    float res;
    for(c=0;c<=100;c++)
    {
    printf("\nEnter an operator (+, -, *, /): \n");
    choice=getch();
    printf("Enter any number:\n");
    scanf("%d",&a);
    printf("Again:\n");
    scanf("%d",&b);
    switch(choice)
    {
        case '+':
          res=a+b;
          printf("Sum is %.0f",res);
        break;
        case '-':
          res=a-b;
          printf("Difference is %.0f",res);
        break;
        case '*':
          res=a*b;
          printf("Multiplication is %.0f",res);
        break;
        case '/':
          res=(float)a/b;
          printf("Division yields the result %.4f",res);
        break;
        default:
        printf("Enter a valid character out of +, -, /, or *");
    }
  }
}
