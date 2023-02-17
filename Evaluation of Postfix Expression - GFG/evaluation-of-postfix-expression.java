//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> s = new Stack<>();
        int p,q;
        for(int i=0;i<S.length();i++){
            char a = S.charAt(i);
            if(Character.isDigit(a)){
                s.push(Integer.valueOf(String.valueOf(a)));
            }else{
                q = s.pop();
                p = s.pop();
                
                if(a=="+".charAt(0)){
                    //System.out.println(p+q);
                    s.push(p+q);
                }
                if(a=="-".charAt(0)){
                    //System.out.println(p-q);
                    s.push(p-q);
                }
                if(a=="*".charAt(0)){
                    //System.out.println(p*q);
                    s.push(p*q);
                }
                if(a=="/".charAt(0)){
                    //System.out.println(p/q);
                    s.push((int)(p/q));
                }
            }
        }
        return s.pop();
    }
}