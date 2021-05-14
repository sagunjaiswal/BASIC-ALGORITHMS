import java.util.Scanner;
public class Main
{
    static void BubbleSort(int[] arr){
        int n = arr.length, xchanges=0;
        for(int i = 0 ; i < (n-1) ;i++){
            xchanges = 0;
            for(int j = 0 ; j < (n-i-1) ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    xchanges++;
                }
            }
            if(xchanges == 0)
                break;
        }
        return;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ;i++)
		    arr[i] = sc.nextInt();
		BubbleSort(arr);
		for(int i = 0 ; i < n ;i++)
		    System.out.print(arr[i]+" ");
		System.out.println();
	}
}

/we traverse the first loop from 0 to n-1 and that is because otherwise it will go
out of bound when we check with the j+1 element.
there will be n-1 passes for the first loop 



Notice that this will always loop n times from 0 to n, so the order of this algorithm is O(n^2). This is both the best and worst case scenario because the code contains no way of determining if the array is already in order.

A better version of bubble sort, known as modified bubble sort, includes a flag that 
is set if an exchange is made after an entire pass over the array. If no exchange is 
made, then it should be clear that the array is already in order because no two elements 
need to be switched. In that case, the sort should end. The new best case order for 
this algorithm is O(n), as if the array is already sorted, then no exchanges are made.
