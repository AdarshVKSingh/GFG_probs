//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<S.length();i++){
            s.push(S.charAt(i));
        }
        String s1 = "";
        while(!s.isEmpty()){
            s1 += s.pop();
        }
        
        return s1;
        
    }

}