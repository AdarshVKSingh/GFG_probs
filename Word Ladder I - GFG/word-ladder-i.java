//{ Driver Code Starts
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
            int n = Integer.parseInt(br.readLine().trim());
            String[] wordList = new String[n];
            for(int i = 0; i < n; i++){
                wordList[i] = br.readLine().trim();
            }
            String startWord, targetWord;
            startWord = br.readLine().trim();
            targetWord = br.readLine().trim();
            Solution obj = new Solution();
            int ans = obj.wordLadderLength(startWord, targetWord, wordList);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends


class Solution
{
    public class Pair{
        String s;
        int num;
        
        public Pair(String s,int num){
            this.s = s;
            this.num = num;
        }
    }
    
    public int wordLadderLength(String startWord, String targetWord, String[] wordList)
    {
        Queue<Pair> q = new LinkedList<>();
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<wordList.length;i++){
            hm.put(wordList[i],1);
        }
        
        q.add(new Pair(startWord,1));
        
        if( !hm.containsKey(targetWord)){
            return 0;
        }
        hm.remove(startWord);
        while(!q.isEmpty()){
            String s = q.peek().s;
            int level  = q.peek().num;
            
            
            if(s.equals(targetWord)){
                return level;
            }
            q.remove();
            
            for(int j=0;j<s.length();j++){
                for(char k = 'a';k<='z';k++){
                    String res = s.substring(0,j)+ k + s.substring(j+1);
                    if(hm.containsKey(res)){
                        hm.remove(res);
                        q.add(new Pair(res,level+1));
                    }
                    
                }
            }
        }
        return 0;
    }
}