import java.util.*;
public class HelloWorld{

     public static void main(String []args){
       Scanner in = new Scanner (System.in);
       int test = in.nextInt();
       int count =0;
       while(count<test){
          int n = in.nextInt();
          int arr[]= new int[n];
          for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
          }
          int sum = in.nextInt();
         if (isSubSetSum(arr, sum,n) == true) 
            System.out.println("Found a subset"
                          + " with given sum"); 
        else
            System.out.println("No subset with"
                               + " given sum"); 
           count++;
       }
     }
     public static  boolean isSubSetSum(int arr[], int sum, int n){
         if(sum == 0){
                return true;
         }
         if(sum !=0 && n==0)
            return false;
        if(arr[n-1]>sum)
            return isSubSetSum(arr, sum, n-1);
       return  isSubSetSum(arr, sum, n-1)||
            isSubSetSum(arr, sum-arr[n-1],n-1);
     }
}
