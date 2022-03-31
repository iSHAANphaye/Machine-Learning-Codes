#include<stdio.h>

void slice(char *str, int m, int n){
    char *ptr ;
    int i;
    for(i=m; i<=n; i++){
        *ptr = str[i];
        ptr++;
    printf("%s", *ptr);
    }
}
 int main(){
    char str[] = "hellooooo";
    slice(str,2,5);
}