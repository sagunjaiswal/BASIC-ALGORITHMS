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
	index = BinarySearch(arr,n,item);
	if(index == -1)
		printf("%d not found in the array",item);
	else
		printf("\n%d found at position %d",item,index+1);
}

int BinarySearch(int arr[], int n, int item){
	int low = 0, up = n-1 , mid;
	while(low<=up){
//		mid = (low+up)/2;
		mid = low + (up - low)/2;
		if(item > arr[mid])
			low = mid+1;
		else if(item < arr[mid])
			up = mid-1;
		else 
			return mid;
	}
	return -1;
}
