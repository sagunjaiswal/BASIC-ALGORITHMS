import java.util.Scanner;
class Queue{
    static int MAX = 10;
    int queue_arr[];
    int front, rear;
    Queue(){
        queue_arr = new int[MAX];
        front = -1;
        rear = -1;
    }
    
    boolean isFull(){
        if(front == 0 && rear == MAX-1)
            return true;
        return false;
    }
    
    boolean isEmpty(){
        if(front == -1)
            return true;
        return false;
    }
    
    void enQueue(int item){
        if(isFull()){
            System.out.println("QUEUE IS FULL");
            return;
        }
        else{
            if(front == -1)
                front = 0;
            rear++;
            queue_arr[rear] = item;
        }
        return;
    }
    
    int deQueue(){
        int item;
        if(isEmpty()){
            System.out.println("Queue is empty");
            System.exit(1);
        }
        
        item = queue_arr[front];
        //if the queue has only one element
        if(front>=rear){
            front = -1;
            rear = -1;
        }
        else
            front++;
        return item;
    }
    
    void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("QUEUE FROM FRONT TO REAR : ");
        for(int i = front ; i <= rear ; i++){
            System.out.print(queue_arr[i]+" ");
        }
        return;
    }
    
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty !");
            System.exit(1);
        }
        return queue_arr[front];
    }
}

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue();
		while(1==1){
		    System.out.println("1. INSERT");
		    System.out.println("2. DELETE");
		    System.out.println("3. DISPLAY ELEMENT AT THE FRONT");
		    System.out.println("4. DISPLAY QUEUE");
		    System.out.println("5. QUIT");
		    System.out.println("Enter the choice : ");
		    int choice = sc.nextInt();
		    switch(choice){
		        case 1:
		            System.out.println("Enter the element you want to insert in the queue : ");
		            int item = sc.nextInt();
		            queue.enQueue(item);
		            break;
		        case 2:
		            item = queue.deQueue();
		            System.out.println("Dequeued element "+item);
		            break;
		        case 3:
		            item = queue.peek();
		            System.out.println("The front of queue : "+item);
		            break;
		        case 4:
		            queue.display();
		            break;
		        case 5:
		            System.exit(1);
		        default:
		            System.out.println("Invalid choice ! Please enter a valid choice .");
		    }
		}
	}
}
