//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int a[], int n) { 
        // Your code here
       long maxl[]=new long[n];
        long maxr[]=new long[n];
        long sum=0;
        long ml=0;
        long mr=0;
        
        for(int i=0;i<n;i++){
            if(a[i]>mr){
                mr=a[i];
                maxr[i]=mr;
                
            }else{
               maxr[i]=mr; 
            }
        }
        for(int i=n-1;i>=0;i--){
            if(a[i]>ml){
                ml=a[i];
                maxl[i]=ml;
            }else{
               maxl[i]=ml; 
            }
        }
        for(int i=0;i<n;i++){
            sum=sum+(Math.min(maxr[i],maxl[i]))-a[i];
        }return sum;
            
            
    
        
        
    }
     
    
    //function to calculate the water between two bars
    static long cal (int arr[],int n,int start,int end){
        if(start==end || start==end-1 || start>end){
            return 0;
        }
        int h = Math.min(arr[start],arr[end]);
        long water = h*(end -start -1);
        
        for(int i=start+1;i<end;i++){
            water = water - arr[i];
        }
        return water;
    }
}


