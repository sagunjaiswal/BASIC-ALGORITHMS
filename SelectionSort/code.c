#include<stdio.h>
#include<conio.h>
#define MAX 10
int main(){
	int arr[MAX],i,j,n,temp,min;
	printf("\nEnter the number of elements : ");
	scanf("%d",&n);
	printf("\nEnter elements of array : ");
	for(i = 0 ; i < n ; i++)
		scanf("%d",&arr[i]);
	for(i = 0 ; i < (n-1) ; i++){
		min = i;
		for(j=(i+1) ; j<n ; j++){
			if(arr[min] > arr[j])
				min = j;
		}
		if(i != min){
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	printf("\n\nSORTED ARRAY : ");
	for(i = 0 ;i < n ;i++)
		printf("%d ",arr[i]);
	printf("\n\n");
}
