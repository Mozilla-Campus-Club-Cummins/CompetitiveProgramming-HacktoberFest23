#include <stdio.h>
#include <stdlib.h>

int search(int arr[],int);

int main() {
	int N,X;
	
	//Input number of elements of the array
	printf("Enter N: ");
	scanf("%d",&N);
	
	int arr[N-1];
	
	printf("Enter elements of array: ");
    
    //Input the array
    for(int a=0; a<N-1; a++)
    {
        scanf("%d",&arr[a]);
        if (arr[a] > N)
        {
            printf("Invalid input!!");
            exit(0);
        }
        
    }
    
	
	X = search(arr,N);
	printf("%d",X);
	
	return 0;
}

int search(int arr[],int N) {
    //Sum of elements of the array arr[]
    int sum_array = 0;
    for (int k=0; k<N-1;k++)
    {
        sum_array += arr[k];
    }
    
    //Sum of N-consecutive numbers
    int sum_nos = (N * (N+1)) / 2;
    
    //Difference of both the sums gives the missing number, return the number
    return sum_nos - sum_array;

}