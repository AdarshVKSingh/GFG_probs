//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {

	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		
		int dis[] = new int[N];
		Arrays.fill(dis,Integer.MAX_VALUE);
		dis[0] = 0;
		
	
	
	for(int i=0;i<N-1;i++){
	    for(int j = 0;j<M;j++){
	        
	        int u = edges[j][0];
	        int v = edges[j][1];
	        int d = edges[j][2];
	        
	        if(dis[u]!= Integer.MAX_VALUE){
	            if(dis[u] + d < dis[v]){
	                dis[v] = dis[u] + d;
	            }
	        }
	        
	        
	    }
	}
	for(int i=0;i<N;i++){
	    if(dis[i]==Integer.MAX_VALUE){
	        dis[i] = -1;
	    }
	}
	
	return dis;
}

}