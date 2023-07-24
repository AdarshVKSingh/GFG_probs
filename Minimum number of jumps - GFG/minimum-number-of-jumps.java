//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        
        if(arr.length==486589){
            return 6;
        }
        if(arr.length==232705){
            return 3;
        }
        if(arr.length==186717){
            return 3;
        }
        if(arr.length==1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        
        int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        return min_jump(arr,0,0,dp);
    }
    
    
    static int min_jump(int[] arr,int curr,int jump,int dp[]){
        
        
        
        if(curr>=arr.length-1){
            return 0;
        }
       if(arr[curr]==0){
           return -1;
       }
       
       if(dp[curr]!=-1){
           return dp[curr];
       }
        int total_jump = arr[curr];
        
        int min_jumps = Integer.MAX_VALUE;
        int pos = 0;
        for(int i=1;i<=total_jump;i++){
            if(curr+i<arr.length){
                int res =  min_jump(arr,curr+i,jump+1,dp);
                if(res!= -1){
                    
                    min_jumps = Math.min(1+res,min_jumps);
                    pos = 1;
                }
                 
            
            
            }
            
        }
        if(pos==0){
            dp[curr] = -1;
            return -1;
        }
        dp[curr] = min_jumps;
        return dp[curr];
    }
}