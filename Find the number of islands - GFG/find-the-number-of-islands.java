//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        
        int vis[][] = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '0'){
                    vis[i][j] = 0;
                }else{
                    vis[i][j] = 1;
                }
            }
        }
        
        int count = 0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(vis[i][j]==1){
                    count++;
                    
                    bfs(i,j,vis);
                }
            }
        }
        return count;
        
    }
    
    public void bfs(int row,int col,int vis[][]){
        if(vis[row][col]==0){
            return;
        }
        vis[row][col] = 0;
        int arrx[] = {1,1,0,-1,-1,-1,0,1};
        int arry[] = {0,1,1,1,0,-1,-1,-1};
        
        for(int i=0;i<8;i++){
             int x = row+arrx[i];
             int y = col +arry[i];
             
             if(x>=0 && x<vis.length && y>=0 && y<vis[0].length && vis[x][y]!=0){
                 
                 bfs(x,y,vis);
             }
        }
        
    }
}