//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


// } Driver Code Ends
//User function Template for Java

class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        for(int i:A1){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            }else{
                hm.put(i,hm.get(i) +1);
            }
           
        }
        
        int arr[] = new int[N];
        int num = 0;
        for(int j:A2){
            hm2.put(j,0);
            if(hm.containsKey(j)){
                int k = hm.get(j);
            for(int m = 0;m<k;m++){
                arr[num] = j;
                num++;
            }
            }
            
           
        }
        int b = num;
        for(int i:A1){
            if(!hm2.containsKey(i)){
                arr[num] = i;
                num++;
            }
        }
        
        Arrays.sort(arr,b,N);
        return arr;
        
        
    }
}



//{ Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}



// } Driver Code Ends