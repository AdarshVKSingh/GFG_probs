//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.findSingle(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int findSingle(int N, int arr[]){
        Arrays.sort(arr);
        if(N==1){
            return arr[0];
        }
        for(int i=1;i<N-1;i++){
            if(arr[i-1]==arr[i] || arr[i+1]==arr[i]){
                
            }else{
                return arr[i];
            }
        }
        
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        return arr[N-1];
    }
}