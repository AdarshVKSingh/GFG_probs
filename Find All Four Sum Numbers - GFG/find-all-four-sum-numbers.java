//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        if(arr.length<4){
            return al;
        }
        Arrays.sort(arr);
        
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        int n = arr.length;
        
        
        for(int i = 0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                
                int rest = k -arr[i] - arr[j];
                int low = j+1,high = n-1;
                while(low<high){
                    if(arr[low]+arr[high]== rest){
                        ArrayList<Integer> a = new ArrayList<>();
                        a.add(arr[i]);
                        a.add(arr[j]);
                        a.add(arr[low]);
                        a.add(arr[high]);
                        if(!hs.contains(a)){
                             al.add(a);
                             hs.add(a);
                        }
                       
                        low++;
                    }else if(arr[low]+arr[high] < rest){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        
        return al;
    }
}