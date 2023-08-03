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
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        int sr=0,sc=0,dr=0,dc=0;
        
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    sr = i;
                    sc = j;
                }
                if(grid[i][j]==2){
                    dr = i;
                    dc = j;
                }
                
            }
        }
        
        if(sr==dr && sc==dc){
            return true;
        }
        return travel(sr,sc,dr,dc,grid,vis);
        
        
    }
    static boolean isSafe(int x,int y,int grid[][],boolean vis[][]){
        if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && vis[x][y]==false && grid[x][y]!=0){
            return true;
        }
        return false;
    }
    static boolean travel(int x,int y,int dr,int dc,int grid[][],boolean [][]vis){
        
        if(x==dr && y == dc){
            return true;
        }
        
        vis[x][y] = true;
        int xdir[] = new int[]{1,-1,0,0};
        int ydir[] = new int[]{0,0,1,-1};
        
        for(int i=0;i<4;i++){
            int newx = x + xdir[i];
            int newy = y + ydir[i];
            
            if(isSafe(newx,newy,grid,vis)){
                if(travel(newx,newy,dr,dc,grid,vis)){
                    return true;
                }
            }
        }
        
        vis[x][y] = false;
        return false;
        
    }
}