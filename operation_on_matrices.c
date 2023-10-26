/*this code allows the user to input two matrices and choose from a menu of
 matrix operations to perform on these matrices, displaying the result based on the selected operation.*/
#include<stdio.h>
int main(){
    int i,j,k,A[3][3],B[3][3],C[3][3],D[3][3],E[3][3],choice;
    //user-input for first matrix
    printf("Enter the elements of first 3x3 matrix:");
    for(i=0;i<3;i++){
        for (j=0;j<3;j++){
        scanf("%d",&A[i][j]);
        }
     }
     //display first matrix
    printf("The first 3x3 matrix is:\n");
    for(i=0;i<3;i++){
        for (j=0;j<3;j++){
            printf("%d\t",A[i][j]);
            }
        printf("\n");
        }
    //user-input for second matrix
    printf("Enter the elements of second 3x3 matrix:");
    for(i=0;i<3;i++){
        for (j=0;j<3;j++){
            scanf("%d",&B[i][j]);
            }
        }
    //display second matrix
    printf("The second 3x3 matrix is:\n");
    for(i=0;i<3;i++){
        for (j=0;j<3;j++){
            printf("%d\t",B[i][j]);
            }
    printf("\n");
        }
    //display menu for various arithmetic operations
    printf("MENU:\n1.Addition\n2.Subtraction\n3.Multiplication\n");
    scanf("%d",&choice);
    //perform selected operation based on users choice
    switch(choice){
    case 1:
    printf("The addition of two matrcies is:\n");
    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            C[i][j]=A[i][j]+B[i][j];//perform matrix addition and store result in C
            printf("%d\t",C[i][j]);
            }
        printf("\n");  
        }
    break;
    case 2:
    printf("The subtraction of two matrcies is:\n");
    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            D[i][j]=A[i][j]-B[i][j];//perform matrix subtraction and store result in D
        printf("%d\t",D[i][j]);
            } 
            
        printf("\n");    
        }
    break;
    case 3:
    printf("The multiplication of two matrcies is:\n");
    for (i=0;i<3;i++){
        for (j=0;j<3;j++){
            E[i][j]=0;
            for (k=0;k<3;k++){
                E[i][j]+=A[i][k]*B[k][j];//perform matrix multiplication and store result in E
                }
            printf("%d\t",E[i][j]);
            }
        printf("\n");
        }
    break;
    default:
        printf("Invalid choice!!\n");
    break;}
    return 0;  
    }