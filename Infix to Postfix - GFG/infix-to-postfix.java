//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        String out = "";
        Stack <Character> s = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isLetter(ch)){
                 out += ch;
            }
            else if(s.isEmpty()){
                s.push(ch);
            }else if(ch == "^".charAt(0)){
                s.push('^');
            }
            else if(ch == "(".charAt(0)){
                s.push('(');
            }else if(ch ==  ")".charAt(0)){
                while(!s.isEmpty() && s.peek()!= "(".charAt(0)){
                    out+= s.pop();
                }
                s.pop();
            }else{
                while(!s.isEmpty() && preference(s.peek())>= preference(ch)){
                    out += s.pop();
                }
                s.push(ch);
            }
        }
        
        while(!s.isEmpty()){
            out+= s.pop();
        }
        return out;
    }
    
    static int preference(char c){
        if(c == "+".charAt(0) || c == "-".charAt(0)  ){
            return 1;
        }else if(c == "/".charAt(0) || c == "*".charAt(0)){
            return 2;
        }else if (c == "^".charAt(0)){
            return 3;
        }else{
            return 0;
        }
    }
}