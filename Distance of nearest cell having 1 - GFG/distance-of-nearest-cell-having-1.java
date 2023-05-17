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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        
    
    int vis[][]  = new int[grid.length][grid[0].length];
    int dis[][]  = new int[grid.length][grid[0].length];
        
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    q.add(new Pair(i,j,0));
                    vis[i][j] = 1;
                    dis[i][j] = 0;
                } 
                else{
                    vis[i][j] = 0;
                    
                }
            }
        }
        
        while(!q.isEmpty()){
            Pair p = q.remove();
            int row = p.x;
            int col = p.y;
            int d = p.d;
            
            
            int arrx[] = {-1,1,0,0};
            int arry[] = {0,0,-1,1};
            
            for(int k = 0;k<4;k++){
                if(row+arrx[k]>=0 && row + arrx[k]<grid.length && col+arry[k]>=0 && col + arry[k]<grid[0].length 
                   && vis[row+arrx[k]][col+arry[k]]==0){
                    vis[row+arrx[k]][col+arry[k]]=1;
                    dis[row+arrx[k]][col+arry[k]] = d+1; 
                    q.add(new Pair(row+arrx[k],col+arry[k],d+1));
                }
            }
            
             
        }
        
        return dis;
        
    }
    
    
}

class Pair{
    int x;
    int y;
    int d;
    
    public Pair(int a,int b,int c){
        this.x = a;
        this.y = b;
        this.d = c;
    }
}