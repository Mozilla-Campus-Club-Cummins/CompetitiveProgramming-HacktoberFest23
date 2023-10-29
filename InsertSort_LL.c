#include <stdio.h>
#include <stdlib.h>
/*creating a node*/
struct node{
int data;
struct node* next;
};
/*function to insert node into sorted list*/
void insertSorted(struct node** head,struct node* newNode){
struct node* temp;
if(*head==NULL||(*head)->data>=newNode->data){
newNode->next= *head;
*head=newNode;
}
else{
temp= *head;
while(temp->next!=NULL&& temp->next->data<newNode->data){
temp=temp->next;
}
newNode->next=temp->next;
temp->next=newNode;
}
}
/*function to print list*/
void printList(struct node* head){
struct node* temp=head;
while(temp!=NULL){
printf("%d ",temp->data);
temp=temp->next;
}
}
/*main function*/
int main(){
struct node* head=NULL;
int n,data;
printf("N=");
scanf("%d",&n);
printf("Linked list=");
for(int i=0;i<n;i++){
struct node* newNode=(struct node*)malloc(sizeof(struct node));
scanf("%d",&data);
newNode->data=data;
newNode->next=NULL;
insertSorted(&head , newNode);
}
printList(head);
return 0;
}
