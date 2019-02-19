/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class OptimalStrategyforaGame {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	    int test = in.nextInt();
	    int count = 0;
	    while(count<test){
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = in.nextInt();
	        }
	        System.out.println(MaxProfit(arr,0,n-1));
	        count++;
	    }
	}
	public static int MaxProfit(int arr[], int i, int j){
	    if(i==j)
	        return arr[i];
	    if(i+1 == j)
	        return Math.max(arr[i],arr[j]);
	  
	    return Math.max(arr[i] + Math.min(MaxProfit(arr,i+2,j),MaxProfit(arr,i+1,j-1))
	                    , arr[j] + Math.min(MaxProfit(arr,i+1,j-1),MaxProfit(arr,i,j-2)));
	}
}
