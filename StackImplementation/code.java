import java.util.Scanner;
class Stack{
    static final int MAX = 10;
    private int top ;
    private int stack_arr[] ;
    Stack(){
        stack_arr = new int[MAX];
        top = -1;
    }
    
    public void push(int item){
        if(isFull()){
            System.out.println("STACK OVERFLOW");
            System.exit(1);
        }
        top++;
        stack_arr[top] = item;
        return;
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        int item = stack_arr[top];
        top--;
        return item;
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return stack_arr[top];
    }
    
    public int getSize(){
        return top+1;
    }
    
    public boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
        //else just write
        //return top == -1;
    }
    
    public boolean isFull(){
        if(top == (MAX-1))
            return true;
        return false;
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            return;
        }
        System.out.println("STACK ELEMENTS : ");
        for(int i = 0 ; i <= top ; i++){
            System.out.print(stack_arr[i]+" ");
        }
    }
}

public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        while(1==1){
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY ELEMENT ON THE TOP");
            System.out.println("4. DISPLAY STACK");
            System.out.println("5. EXIT");
            System.out.println();
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    int item = sc.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    item = stack.pop();
                    System.out.println("Popped Item : "+item);
                    break;
                case 3:
                    item = stack.peek();
                    System.out.println("TOP ELEMENT : "+item);
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid choice");
            }
        }        
     }
}
