import java.util.Scanner;
public class SelectionSort{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements : ");
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();
        
        //selection sort
        for(int i = 0 ; i < (n-1) ; i++){
            int min = i;
            for(int j = (i+1) ; j < n ; j++){
                if(arr[min] > arr[j])
                    min = j;
            }
            if(i != min){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("\nSorted array : ");
        for(int i = 0 ; i < n ; i++)
            System.out.print(arr[i]+" ");
     }
}

/* suppose that you are given some numbers and asked to arrange them in ascending order. The most intuitive
way to do this would be to find the smallest number and put in the first place and then find thensecond smallest 
number and put it in the second place and so on. this is the technique of selection sort.

In every iteration of outer for loop we have to exchange arr[i] with the smallest element among arr[i]...arr[n-1].
The inner for loop is used to find the smallest element and it is stored to min.Initially variable min is initialized 
with i. After this, arr[min] is compared with each of the elements arr[i+1],arr[i+2]...arr[n-1] and swap the smallest.

In selection sort, the number of comparisons does not depend on the order of data i.e., selection sort is not data
sensitive.
the number of comparisons is same whether the input data is sorted,reverse sorted or in random order.

In first pass, arr[0] is compared with arr[1]...arr[n-1], so there will be n-1 comparisons,
In second pass, arr[1] is compared with arr[2]...arr[n-1], so there will be n-2 comparisons,
In last pass, arr[n-2] is compared with arr[n-1], so there will be 1 comparisons,
(n-1)+(n-2)...3+2+1 = n(n-1)/2 = o(n2)

so the selection sort is o(n2) in all three cases.
selection sort's main advantage is data movement is very less.If an element is at its proper place then 
it will not be moved at all,so if many elements are at proper place i.e., the list is almost sorted then there will 
be very little data movement. thus we see that the number of swaps depends on the order of data and it can never be 
more than n-1. The swaps are very less as compared to insertion and bubble sorts. 

Selection sort is not a stable sort. It requires only one temporary variable so it is an in-place sort,
space complexity is o(1).

*/
