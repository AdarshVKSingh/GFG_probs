//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        
        // HashMap<Character,Integer> hm = new HashMap<>();
        //  HashMap<Character,Integer> hm2 = new HashMap<>();
        // String s = "";
        // ArrayList<Character> al = new ArrayList<>();
        // for(int i=0;i<A.length();i++){
        //     char ch = A.charAt(i);
        //     if(!hm.containsKey(ch)){
        //         al.add(al.size(),ch);
        //         hm.put(ch,1);
        //     }else{
        //         if(!hm2.containsKey(ch)){
        //             int ind = al.indexOf(ch);
        //             if(ind!=-1){
        //                  al.remove(ind);
        //             }
                    
        //             hm2.put(ch,1);
        //         }
                
               
        //     }
            
        //     if(al.size()>0){
        //         s += al.get(0);
        //     }else{
        //         s += "#";
        //     }
        // }
         
       int f[] = new int[26];
       Arrays.fill(f,0);
       Queue<Character> q = new LinkedList<>();
       StringBuilder s = new StringBuilder();
       
       
       for(int i=0;i<A.length();i++){
           char ch = A.charAt(i);
           int nidx = ch- 'a';
           if(f[ch -'a']==0){
              // System.out.println(ch);
               q.add(ch);
           }
            
           f[nidx] = f[nidx] + 1;
           
           while(!q.isEmpty() && f[q.peek()-'a']>1){
               q.remove();
              
           }
           
           if(q.isEmpty()){
               s.append("#");
           }else{
               s.append(q.peek());
           }
       }
       
       return s.toString();
        
    }
}