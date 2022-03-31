#include<stdio.h>
#include<string.h>
int main()
{
    char str[20];
    char temp;
    scanf("%s",str);
    int a,b,n=strlen(str);
    for(a=0;a<n-1;a++)
    {
        for(b=a+1;b<n;b++)
        {
            if(str[a]>str[b])
            {
                temp = str[a];
				str[a] = str[b];
				str[b] = temp;
            }
        }
    }
    printf("%s",str);
}