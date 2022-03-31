#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
    char a[100];
    int b;
    printf("Enter sentence:\n");
    gets(a);
    for(b=strlen(a),b>=0;b--;)
    {
       printf("%c",a[b]);
    }
}
