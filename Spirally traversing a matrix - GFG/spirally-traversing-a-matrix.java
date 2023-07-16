//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int count = 0;
        int xd=1,yd=0,x=0,y=0;
        boolean vis[][] = new boolean[r][c];
        while(count!=r*c){
            count++;
            if(x+yd == r || y+xd == c||x+yd==-1||y+xd==-1|| vis[x+yd][y+xd]){
                if(xd == 0 && yd==1){
                    xd = -1 ;
                    yd = 0;
                }else if(xd==0 && yd==-1){
                    xd = 1;
                    yd = 0;
                }else if(yd ==0 && xd ==1){
                    xd = 0;
                    yd = 1;
                }else{
                    xd  =0;
                    yd = -1;
                }
            }
            try{
                al.add(matrix[x][y]);
                vis[x][y] = true;
                
            }
            catch(Exception e){
                System.out.println("*");
            }
            // al.add(matrix[x][y]);
            // vis[x][y] = true;
            x = x+ yd;
            y = y+ xd;
            
           
            
        }
        
        return al;
    }
}
