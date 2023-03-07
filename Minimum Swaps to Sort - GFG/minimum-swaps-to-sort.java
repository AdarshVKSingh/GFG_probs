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
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        int arr[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(nums);
        
        int count = 0;
        
        for(int j = 0;j < nums.length;j++){
            if(nums[j]!=arr[j]){
                count++;
                int index = findIndex(arr,nums[j]);
                swap(arr,j,index);
            }
        }
        
        return count;
        
        
    }
    
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int findIndex(int arr[],int ele){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
    
}   
