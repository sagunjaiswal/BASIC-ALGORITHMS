#include<stdio.h>
#define MAX 20
int main(){
	int arr[MAX],i,j,temp,n,xchanges = 0;
	printf("\nEnter the number of elements : ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	for(i=0;i<n-1;i++){
		xchanges = 0;
		for(j = 0 ; j < (n-i-1) ;j++)	{
			if(arr[j] > arr[j+1]){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				xchanges++;
			}
		}
		if(xchanges == 0)
			break;
	}
	printf("\nThe sorted list is : ");
	for(i=0;i<n;i++){
		printf("%d ",arr[i]);
	}
}
