//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0;i<a.length();i++){
            char ele = a.charAt(i);
            if(hm.containsKey(ele)){
                hm.replace(ele,hm.get(ele)+1);
            }else{
                
                hm.put(ele,1);
            }
        }
        for(int i=0;i<b.length();i++){
            char ele = b.charAt(i);
            if(hm.containsKey(ele)){
                if(hm.get(ele)==0){
                    return false;
                }
                hm.replace(ele,hm.get(ele)-1);
            }else{
                return false;
            }
        }
        
        return true;
        
    }
}