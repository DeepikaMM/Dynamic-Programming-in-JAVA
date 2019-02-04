import java.util.*;
public class Knapsack{

     public static void main(String []args){
       Scanner in = new Scanner(System.in);
       int test = in.nextInt();
       int count = 0;
       while(count<test){
           int W = in.nextInt();
           int n = in.nextInt();
           int[] wt =new int[n];
           for(int i=0;i<n;i++)
            wt[i] = in.nextInt();
            
            
            int val[]=new int[n];
           for(int j=0;j<n;j++)
            val[j] = in.nextInt();
        
        int result= KnapSackRe(wt,val,n,W);
            System.out.println(result);
           count++;
       }
       
     }
      static int KnapSackRe(int wt[],int val[],int n, int W){
        int i, w; 
     int K[][] = new int[n+1][W+1]; 
       
     // Build table K[][] in bottom up manner 
     for (i = 0; i <= n; i++) 
     { 
         for (w = 0; w <= W; w++) 
         { 
             if (i==0 || w==0) 
                  K[i][w] = 0; 
             else if (wt[i-1] <= w) 
                   K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]); 
             else
                   K[i][w] = K[i-1][w]; 
         } 
      } 
       
      return K[n][W]; 
        }
     
}

   
