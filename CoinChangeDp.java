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
         
            System.out.println("Found " + CoinChange(arr, sum,n) +" "+ " ways");
                           
           count++;
       }
     }
     public static  int CoinChange(int arr[], int sum, int n){
        
            int table[] = new int [sum + 1];
            Arrays.fill(table,0);
            table[0] = 1;
            for(int i=0;i<n;i++)
                for(int j = arr[i] ; j<=sum;j++)
                    table[j] = table[j] + table[j-arr[i]];
            return table[sum];
        
     }
}
