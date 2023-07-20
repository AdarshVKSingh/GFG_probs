//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        ArrayList<String> f = new ArrayList<>();
        f =  power(s,"");
        Collections.sort(f);
        f.remove(0);
    
        return f;
    }
    
    public ArrayList<String> power(String up,String p){
        
        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        char a = up.charAt(0);
        ArrayList<String> al = new ArrayList<>();
        al.addAll(power(up.substring(1),p + a));
        al.addAll(power(up.substring(1),p));
        
        return al;
    }
}