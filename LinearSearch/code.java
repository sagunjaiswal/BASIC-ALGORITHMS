#include<stdio.h>
#define MAX 20
int main(){
	int i , n, item, arr[MAX], index;
	printf("\nEnter the number of elements : ");
	scanf("%d",&n);
	printf("\nENTER THE ELEMENTS : ");
	for(i=0;i<n;i++)
		scanf("%d",&arr[i]);
	printf("\nEnter the element to be searched : ");
	scanf("%d",&item);
	index = LinearSearch(arr,n,item);
	if(index == -1)
		printf("%d not found in the array",item);
	else
		printf("\n%d found at position %d",item,index+1);
}

int LinearSearch(int arr[], int n , int item){
	int i;
	for(i=0;i<n; i++){
		if(arr[i]==item)
			return i;
	}
	return -1;
}

