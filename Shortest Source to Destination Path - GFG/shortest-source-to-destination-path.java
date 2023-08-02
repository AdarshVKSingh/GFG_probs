//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Pair{
    int dis,f,s;
    
    Pair(int d,int first,int second){
        this.f = first;
        this.s = second;
        this.dis = d;
    }
}
class Solution {
    
    
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        
        boolean vis[][] = new boolean[N][M];
        if(A[0][0]==0 ){
            return -1;
        }
        if(X==0 && Y==0){
            return 0;
        }
        
        int dist[][] =new int[N][M];
        for(int i=0;i<N;i++){
            for(int j = 0;j<M;j++){
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0,0));
        
        int ax[] = new int[]{1,-1,0,0};
        int ay[] = new int[]{0,0,1,-1};
        
        while(!q.isEmpty()){
            Pair p = q.remove();
            int dis = p.dis;
            int x = p.f;
            int y = p.s;
            vis[x][y] = true;
            for(int i=0;i<4;i++){
                int newx = x + ax[i];
                int newy = y + ay[i];
                
                if(isSafe(newx,newy,A,vis,dist,dis)){
                    
                    if(newx==X && newy == Y){
                        return dis+1;
                    }else{
                        dist[newx][newy] = dis+1;
                        q.add(new Pair(dis+1,newx,newy));
                    }
                }
            }
            
        }
        
        return -1;
       
        
    }
    
    static boolean isSafe(int newx,int newy,int A[][],boolean[][] vis,int dist[][],int dis){
         if(newx>=0 && newy>=0 && newx<A.length && newy < A[0].length && vis[newx][newy]==false && A[newx][newy]==1 &&
                dis + 1<dist[newx][newy]){
                
               
               return true;
            }
            
            return false;
    }
    
    
};