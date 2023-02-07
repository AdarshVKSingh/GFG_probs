//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.stream.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            List<String> dict = new ArrayList<String>();
            for(int i = 0;i < n;i++)
                dict.add(arr[i]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            List<String> ans = new ArrayList<String>();
            ans = ob.wordBreak(n, dict, s);
            if(ans.size() == 0)
                System.out.println("Empty");
            else{
                List<String> sol = ans.stream().sorted().collect(Collectors.toList());
                for(int i = 0;i < sol.size();i++)
                    System.out.print("("+sol.get(i)+")");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        ArrayList<String> arr = wordfind(n,dict,"",s);
        return arr;
    }
    
    static ArrayList<String> wordfind(int n,List<String> dict,String p,String up){
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<up.length()+1;i++){
            String a = up.substring(0,i);
            String b = up.substring(i,up.length());
            if(isSafe(a,dict)){
                //System.out.println(up);
                if(p.isEmpty()){
                    arr.addAll(wordfind(n,dict,a,b));
                }else{
                    arr.addAll(wordfind(n,dict,p+" "+a,b));
                }
                
            }
        }
        return arr;
    }
    
    static boolean isSafe(String word,List<String> dict){
        if(dict.contains(word)){
            //System.out.println(word);
            return true;
        }
        return false;
    }
}

