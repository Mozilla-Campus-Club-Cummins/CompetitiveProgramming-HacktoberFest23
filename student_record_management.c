#include <stdio.h>
#include <stdlib.h>
//define student structure to store student information
struct student {
    char name[50];
    int rollno, marks;
};
//declaring an array of structures to store multiple students information
struct student std[100];
//define function to get student details via rollno
void std_search(int numberOfStudents){
    int rollno,i,found=0;
    printf("\n Enter student Roll no to be searched:");
    scanf("%d",&rollno);
    printf("\n************************************************\n");
    for(i = 0; i < numberOfStudents; i++){
        if (std[i].rollno==rollno){
            found = 1;
            printf("Roll No.:%d\n", std[i].rollno);
            printf("Name:%s\n", std[i].name);
            printf("Marks:%d\n", std[i].marks);
            break;
        }
    }
    if (found!=1){
        printf("Record not found!!\n");
    }
}
//define function to display all student's details
void display_std(int numberOfStudents){
    int i;
    printf("the List of students is:\n");
    printf("*************************************************\n");
    printf("Student-Roll No   Student-Name    Student-Marks\n");
    for (i=0;i<numberOfStudents;i++){
        printf("%d               %s                 %d",std[i].rollno,std[i].name,std[i].marks);
        printf("\n");
    }
}
//define students details whose marks are >30
void greater_marks(int numberOfStudents){
    int i,found = 0;
    printf("\n Details of students whose marks greater than 30\n");
    printf("\n************************************************\n");
    for(i=0;i<numberOfStudents;i++){
        if (std[i].marks>30){
            found=1;
            printf("\nStudent name:%s\nStudent rollno:%d\nStudent marks:%d\n",std[i].name,std[i].rollno,std[i].marks);
        }
    }
    if (found!=1){
        printf("\n Records not found!!\n");
    }
}
int main(){
    int n,i,ch;
    printf("Enter number of student records you would like to have:\nEnter limit(<100)");
    scanf("%d",&n);

    //user-input student details
    for (i=0;i<n;i++){
        printf("*********************************************************\n");
        printf("Enter the details of student:\n");
        printf("*********************************************************\n");
        printf("\nEnter name of student:");
        scanf("%s",std[i].name);
        printf("\nEnter Student RollNo.:");
        scanf("%d",&std[i].rollno);
        printf("\nEnter student marks:");
        scanf("%d",&std[i].marks);
    }
    //display menu for various actions
    printf("\n*******************************************************\n");
    printf("MENU:\n");
    printf("\n********************************************************\n");
    printf("1.List of all Students\n2.Search student by RollNo.\n3.Display student name whos marks are >30\n4.Exit\n");
    printf("Enter you choice:");
    scanf("%d",&ch);
    switch(ch)
    { 
        case 1:display_std(n);
        break;
        case 2:std_search(n);
        break;
        case 3:greater_marks(n);
        break;
        case 4:
            printf("You have exited!\n");
            exit(0);
        break;
        default:
            printf("Invalid choice!!\n");
        break;
    }
    return 0;
}
