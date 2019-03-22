import java.util.*;
public class MinNumberOfCoinsToMakeChange{
    public static void main(String args[])
    {
        Scanner in  = new Scanner(System.in);
        int V = in.nextInt();
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
       System.out.println(MakeChange(arr,V,n));
    }
    
    public static int MakeChange(int arr[], int v, int n){
        
        int table[] = new int[v+1];
        table[0] = 0; 
        for (int i = 1; i <= v; i++) 
        table[i] = Integer.MAX_VALUE; 
        for(int j =1;j<=v;j++){
            for(int k=0;k<n;k++){
                 if(arr[k]<=j){
                int Subres =   table[j-arr[k]];
                if(Subres!=Integer.MAX_VALUE && Subres+1<table[j])
                table[j] = Subres+1;
            }
            }
            }
        
        return table[v];
    }
}
