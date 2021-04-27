/* 
input is given 
n 
capacity
in loop
 value followed weight
 */
 

import java.util.*;
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
public class Solution{
    //Function to get the maximum total value in the knapsack.
    static double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr, new Comparator<Item>(){
            public int compare(Item o1, Item o2){
                return (o1.weight*o2.value - o1.value*o2.weight);
            }
        });
        double totalValue = 0d;
        for(Item i : arr){
            int currWt = (int)i.weight;
            int currVal = (int)i.value;
            
            if(W-currWt >= 0){
                W -= currWt;
                totalValue += currVal;
            }
            else {
                double fraction = ((double)W/(double)currWt);
                totalValue += (currVal*fraction);
                W = (int)(W - (currWt * fraction));
                break;
            }
        }
        return totalValue;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cap = sc.nextInt();
        Item[] arr = new Item[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = new Item(sc.nextInt(), sc.nextInt());
        }
        double res = fractionalKnapsack(cap, arr,n) ;
        System.out.println(res);
    }
}
