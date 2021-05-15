import java.util.Scanner;
public class Main
{
    static int BinarySearch(int arr[], int n, int item){
	    int low = 0, up = n-1 , mid;
	    while(low<=up){
            //mid = (low+up)/2;
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
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int[] arr = new int[20];
		System.out.println("Enter the number of elements : ");
	    int n = sc.nextInt();
	    System.out.println("ENTER THE ELEMENTS : ");
	    for(int i=0;i<n;i++)
		    arr[i] = sc.nextInt();
	    System.out.println("\nEnter the element to be searched : ");
	    int item = sc.nextInt();
	    int index = BinarySearch(arr,n,item);
	    if(index == -1)
		    System.out.println(item+" not found in the array");
	    else
		    System.out.println(item+" found at position "+(index+1));
	}
}
