public class MaximumSumofaPathinaRightNumberTriangle{

     public static void main(String []args){
         int tri[][] = {{1}, {2,1}, {3,3,2}}; 
         System.out.println(maxSum(tri,3));
     }
     
     public static int maxSum(int [][] tri, int n){
         if(n>1)
         {
             tri[1][0] = tri[0][0]+ tri[1][0];
             tri[1][1] = tri[1][1] + tri[0][0];
         }
         for(int i=2;i<n;i++)
         {
             tri[i][0] = tri[i][0] + tri[i-1][0];
             tri[i][i] = tri[i][i] + tri[i-1][i-1];
             for(int j=1;j<i;j++)
             {
                 if((tri[i][j] + tri[i-1][j]) > (tri[i][j]+tri[i-1][j-1]))
                    tri[i][j] = tri[i][j] + tri[i-1][j];
                else
                     tri[i][j] = tri[i][j]+tri[i-1][j-1];
             }
         }
         int max = tri[n-1][0];
         for(int k= 1;k<n;k++)
         if(tri[n-1][k]>max)
         max= tri[n-1][k];
         return max;
     }
}
