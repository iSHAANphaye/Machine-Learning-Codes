#include <stdio.h>
int main()
{
    char name[10],lstnm[10];
    printf("Enter your name: ");
    gets(name);
    printf("Enter last name: ");
    gets(lstnm);
    printf("%s%s",name,lstnm);
}