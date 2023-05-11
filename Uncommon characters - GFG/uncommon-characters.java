//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        
        // code here
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        ArrayList<Character> list = new ArrayList<>();
        
        String str = "";
        
        for(int i = 0; i < A.length(); i++)
        {
            char ch = A.charAt(i);
            set1.add(ch);
        }
        
        for(int i = 0; i < B.length(); i++)
        {
            char ch = B.charAt(i);
            set2.add(ch);
        }
        
        for(int i = 0; i < A.length(); i++)
        {
            char ch = A.charAt(i);
            if(!set2.contains(ch))
            {
                if(!list.contains(ch))
                    list.add(ch);
            }
                
        }
        
        for(int i = 0; i < B.length(); i++)
        {
            char ch = B.charAt(i);
            if(!set1.contains(ch))
            {
                if(!list.contains(ch))
                    list.add(ch);
            }
        }
        
        if(list.size() == 0)
            return "-1";
        
        Collections.sort(list);
       for(char ch : list)
       {
           str += ch;
       }
       
       return str;
    }
}