#include<stdio.h>
#include<ctype.h>
int main(){
    char str[100];
    int i,count=0,found=0;
    printf("Enter the string:");
    scanf("%s",str);
    for(i=0;str[i]!='\0';i++){
        count++; //calculate string length
    }
    for(i=0; i<count ;i++){
        if (str[i]==str[count-i-1]){//comparing characters
            found=1;
            break;
        }
    }
    if(found){printf("%s is a palindrome.\n",str);}
    else{printf("%s is not a palindrome.\n",str);}
    return 0;
}