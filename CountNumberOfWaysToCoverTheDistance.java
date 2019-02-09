import java.util.*;
public class CountNumberOfWaysToCoverTheDistance{

     public static void main(String []args){
       Scanner in  = new Scanner(System.in);
       int test = in.nextInt();
       int c = 0;
       while(c<test){
           int distance = in.nextInt();
           System.out.println(CountDistance(distance));
           c++;
       }
     }
     
     public static int CountDistance(int n){
         int dp[]= new int[n+1];
        
         for(int i=0;i<=n;i++){
             if(i==0 ||i==1 || i==2)
                dp[i] = i;
                else
            dp[i] = dp[i-1] + dp[i-2] + 1;
         }
        return dp[n];
     }
}
