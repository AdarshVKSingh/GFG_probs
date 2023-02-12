//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        boolean result = solve(grid);
        if(result){
            //printGrid(grid);
        }
        return result;
         
    }
    
    static boolean solve(int grid[][]){
        int row = -1,col=-1,n= grid.length;
        
        boolean found = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    row = i;
                    col = j;
                    found = true;
                    break;
                    
                }
            }
            
            if(found){
                break;
            }
        }
        if(!found){
            return true;
        }
        
        for(int i =1;i<=n;i++){
            if(isSafe(grid,row,col,i)){
                grid[row][col] = i;
                if(solve(grid)){
                    return true;
                }else{
                    grid[row][col] = 0;
                }
            }
        }
        return false;
    }
    
    
  
   
    
    static boolean isSafe(int grid[][],int row,int col,int val){
        
        for(int i=0;i<grid.length;i++){
            if(grid[row][i]==val){
                return false;
            }
        }
        
        for(int j=0;j<grid.length;j++){
            if(grid[j][col]==val){
                return false;
            }
        }
        
        
        int a = (int)Math.sqrt(grid.length);
        int start_row = row - row%a;
        int start_col = col - col%a;
        
        for(int i = start_row;i<start_row+a;i++){
            for(int j=start_col;j<start_col+a;j++){
                if(grid[i][j]==val){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid(int grid[][])
    {
        for(int i = 0;i<grid.length;i++){
            for(int j= 0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            
        }
        
    }
}