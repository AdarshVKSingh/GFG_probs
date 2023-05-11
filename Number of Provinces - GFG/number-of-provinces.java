//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        
        int count = 0;
        
        boolean visited[] = new boolean[V];
        ArrayList<Integer> al  = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> adjc = new  ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            adjc.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(adj.get(i).get(j)==1 && i!=j){
                    adjc.get(i).add(j);
                    // adjc.get(j).add(i);
                }
            }
        }
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                count++;
                dfs(i,adjc,al,visited);
            }
        }
        
        return count;
    }
    
    
    public static void dfs(int index, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> al,boolean visited[]){
        
        if(!visited[index]){
            al.add(index);
            visited[index] = true;
            for(int i : adj.get(index)){
                dfs(i,adj,al,visited);
            }
        }
    }
};