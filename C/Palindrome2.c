#include <stdio.h>
#include <conio.h>
main()
{
    char string [80],c;
    int i,j,len,flag=0;
    printf("Enter a String for Palindrome Check:\n\n");
    scanf("%s[80]",string);
    printf("%s",string);
    for(len=0;string[len]!='\0';len++)
    printf("\n\nLength is %d\n",len);
    for(i=0,j=len-1;i<len/2;i++,j--)
    {
        if(string[i]!=string[j])
            flag=1;
    }
    if(flag)
    {
      printf("\nString is not Palindrome.\n");
    }
    else
    {
      printf("\nString is a Palindrome.\n");
    }
    return 0;
}