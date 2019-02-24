import java.util.*;
public class WordBreakDp{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int count = 0;
        while(count < test){
            String str = in.next();
            //System.out.println("The size is " + str);
            System.out.println(WordBreak(str));
            count++;
        }
     }
     
     public static boolean WordBreak(String str){
         int size = str.length();
         
         int i,j;
         if(size == 0)
            return true;
         boolean wb[] = new boolean[size+1];
         for(i=0;i<=size;i++)
            wb[i] = false;
        
        for(i = 1;i<=size;i++){
            if(wb[i]==false && dictionary(str.substring(0,i)))
                wb[i] = true;
          
            if(wb[i]==true)
            {
                for(j=i+1;j<=size;j++){
                    if(wb[j] == false && dictionary(str.substring(i,j-i)))
                        wb[j]= true;
                    if(j==size && wb[j]==true)
                        return true;
                    
                }
            }
        }
        return false;
     }
     public static boolean dictionary(String str){
         String dictionary[] = {"mobile","samsung","sam","sung","man","mango", 
                           "icecream","and","go","i","like","ice","cream"}; 
         int size = dictionary.length;
        for (int i = 0; i < size; i++) {
            //System.out.println(dictionary[i] + " " + str);
             if (dictionary[i] == str) 
                return true; 
           
        }
            return false; 
     }

}           
            
            
    
