import java.util.*;
public class LargestSumContiguousSubarray{

     public static void main(String []args){
        Scanner in = new Scanner (System.in);
        int n  = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = in.nextInt();
        Solution(arr,n);
     }
     
     public static void Solution(int arr[], int n){
         int max_ending_here = 0;
         int max_so_far = Integer.MIN_VALUE;
         int s = 0;
         int start = 0;
         int end=0;
         for(int i=0;i<n;i++){
             max_ending_here = max_ending_here + arr[i];
             if(max_ending_here<0){
                  max_ending_here= 0;
                  s =i+1;
             }
               
            else if(max_ending_here>max_so_far){
                max_so_far = max_ending_here;
                start =s;
                end = i;
            }
                
             
         }
           System.out.println("Maximum contiguous sum is " 
                           + max_so_far); 
        System.out.println("Starting index " + start); 
        System.out.println("Ending index " + end); 
         
     }
}
