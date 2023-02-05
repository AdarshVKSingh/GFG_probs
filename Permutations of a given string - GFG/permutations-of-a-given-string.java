//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        ArrayList<String> arr = permutation("",S);
        HashSet<String> hash = new HashSet<>(arr);
        ArrayList<String> arr2 = new ArrayList<>();
        for(String word: hash){
            arr2.add(word);
        }
        
        Collections.sort(arr2);
        
        return arr2;
    }
    
    public ArrayList<String> permutation(String p,String up){
        
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            
            return arr;
        }
        
        ArrayList<String> arr = new ArrayList<>();
      
        char a = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String b = p.substring(0,i);
            String c = p.substring(i,p.length());
            arr.addAll(permutation(b+a+c,up.substring(1)));
        }
        return arr;
    }
}