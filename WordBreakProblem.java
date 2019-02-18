/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class WordBreakProblem  {
	public static void main (String[] args) {
	Scanner in = new Scanner (System.in);
	int test = in.nextInt();
	int count =0;
	while(count<test){
	    String str = in.next();
	    
	    System.out.println(wordBreak(str));
	    count ++;
	}
	}
	
	public static boolean wordBreak(String str){
	    int size = str.length();
	    boolean wb[] = new boolean[size+1];
	    wb[0]  = true;
	      
	    
	    for (int i=1; i<=size; i++) 
       { 
        
        if (wb[i] == false && dictionaryContains( str.substring(0, i) )) 
            wb[i] = true; 
  
        if (wb[i] == true) 
        { 
           
            if (i == size) 
                return true; 
  
            for (int j = i+1; j <= size; j++) 
            { 
               
                if (wb[j] == false && dictionaryContains( str.substring(i, j-i) )) 
                    wb[j] = true; 
  
                
                if (j == size && wb[j] == true) 
                    return true; 
           } 
        } 
       }
       return false;
    } 
	
	
	public static boolean dictionaryContains(String str){
	     String dictionary[] = {"mobile","samsung","sam","sung", 
                            "man","mango","icecream","and","i",
                             "go","like","ice","cream"}; 
                              //System.out.println(str);
                              
         int size = dictionary.length;
          //System.out.println(size);
         for(int i=0;i<size;i++){
             if((dictionary[i].equals(str))){
                 System.out.println(dictionary[i]);
                  return true;
                 
             }
            
               
         }
         return false;
	}
}
