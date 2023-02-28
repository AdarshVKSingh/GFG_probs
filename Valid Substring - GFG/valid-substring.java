//{ Driver Code Starts
//Initial Template for Java
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
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution {
    static int findMaxLen(String S) {
        Stack <Character> s1 = new Stack<>();
        Stack <Integer> s2 = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            if(s1.isEmpty()){
                s1.push(S.charAt(i));
                s2.push(i);
            }else if(s1.peek() == '(' && S.charAt(i) == ')'){
                s1.pop();
                s2.pop();
            }else{
                s1.push(S.charAt(i));
                s2.push(i);
            }
            
        }
        
        
        
        int res = S.length();
        int max = 0;
        
        while(!s2.isEmpty()){
            int a = s2.pop();
            if(max<res-a -1){
                max = res-a-1;
            }
            res = a;
        }
        
        if(max< res){
            max = res;
        }
        
        return max;
        
    }
};