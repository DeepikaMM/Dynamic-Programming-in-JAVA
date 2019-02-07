import java.util.*;
public class FindNumberOfWaysToDoPartition{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
         int test = in.nextInt();
         int count =0;
         while(count < test){
             int n = in.nextInt();
             int k = in.nextInt();
             int res = FindNumberOfWaysToDoPartition(n,k);
             System.out.println(res);
             count++;
         }
     }
     
       public static int FindNumberOfWaysToDoPartition(int n,int k){
           
           int dp [][ ] = new int[n+1][k+1];
           int i,j;
             for ( i = 0; i <= n; i++) 
                 dp[i][0] = 0; 
             for ( i = 0; i <= k; i++) 
                 dp[0][k] = 0; 
             for(i=1;i<=n;i++){
               for(j=1;j<=k;j++){
                   
                    if(j==1 || j==i)
                    dp[i][j] = 1;
                    else
                    dp[n][k] = dp[n-1][k] * k + dp[n-1][k-1];
               }
           }
         
         return dp[n][k];
         
     }      
}
