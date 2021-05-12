#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define MAX 10
int queue_arr[MAX];
int rear = -1;
int front = -1;
void insert(int item);
int del();
int peek();
void display();
int isFull();
int isEmpty();

int main(){
	int choice, item;
	while(1){
		printf("\n1. INSERT");
		printf("\n2. DELETE");
		printf("\n3. DISPLAY ELEMENT AT THE FRONT");
		printf("\n4. DISPLAY QUEUE");
		printf("\n5. EXIT");
		printf("\n\nEnter your choice : ");
		scanf("%d",&choice);
		switch(choice){
			case 1: 
				printf("\nEnter the element you want to insert in the queue : ");
				scanf("%d",&item);
				insert(item);
				break;
			case 2:
				item = del();
				printf("\nDequeued element : %d",item);
				break;
			case 3:
				printf("\nElement at the front of the queue : %d",peek());
				break;
			case 4:
				display();
				break;
			case 5:
				exit(1);
				break;
			default:
				printf("\nInvalid choice! Please enter a valid choice.");
		}
	}
}

void insert(int item){
	if(isFull()){
		printf("\nQueue Overflow");
		return;
	}
	if(front == -1)
		front = 0;
	rear++;
	queue_arr[rear] = item;
	return;
}

int del(){
	int item;
	if(isEmpty()){
		printf("\nQueue Underflow");
		exit(1);
	}
	item = queue_arr[front];
	front++;
	return item;
}

int peek(){
	if(isEmpty()){
		printf("\nQueue Underflow");
		exit(1);
	}
	return queue_arr[front];
}

int isEmpty(){
	if(front == -1 || front == rear+1)
		return 1;
	return 0;
}

int isFull(){
	if(rear == (MAX-1))
		return 1;
	return 0;
}

void display(){
	int i;
	if(isEmpty()){
		printf("\nQueue is Empty!!");
		return;
	}
	printf("\nQUEUE : ");
	for(i = front ; i<=rear ; i++)
		printf("%d ",queue_arr[i]);
	printf("\n\n");
}
