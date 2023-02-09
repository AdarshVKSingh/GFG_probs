//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
        ArrayList<String> dict  = new ArrayList<>();
        ArrayList<String> arr5 = palindrome("",S);
        
        HashSet<String> arr1 = new HashSet<>(arr5);
        ArrayList<String> arr6 = new ArrayList<>(arr1);
        Collections.sort(arr6);
        //System.out.println(arr1);
        for(String s: arr6){
            String [] arr2 = s.split(" ");
            ArrayList<String> arr4 = new ArrayList<>();
            for(String ele: arr2){
                arr4.add(ele);   
            }
            arr.add(arr4);
        }
        return arr;
    }
    
    static ArrayList<String> palindrome(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            //System.out.println(p);
            
                arr.add(p);
           
            arr.add(p);
            return arr;
        }
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0;i<up.length();i++){
            String a = up.substring(0,i+1);
            if(p.isEmpty()){
                if(isPalindrome(a)){
                arr.addAll(palindrome(a,up.substring(i+1)));
                }
            }
                 
            else{
                if(isPalindrome(a)){
                //System.out.println(p+" " + a + " " + up.substring(i));
                arr.addAll(palindrome(p+" "+a,up.substring(i+1)));
                }
            }
            
        }
        
        return arr;
        
    }
    
    static boolean isPalindrome(String word){
        //System.out.println(word);
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
};