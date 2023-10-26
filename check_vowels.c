#include<stdio.h>
#include<ctype.h>
int main(){
    char str[100];
    int i,count=0,vowel=0;
    printf("Enter the String:");
    fgets(str,sizeof(str),stdin);
    for (i=0 ; str[i] != '\0' ; i++){
        count++;
        str[i]=tolower(str[i]);//converted whole string to lowercase to consider both uppercase and lowercase cases
        if (str[i] >= 'a' &&  str[i] <= 'z'){
            if (str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u'){
                vowel++;}}}
printf("The number of vowels in your string are: %d",vowel);
printf("\n");
    return 0;
}