//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s1 = br.readLine().trim();
            String[] S1 = s1.split(" ");
            int n = Integer.parseInt(S1[0]);
            int k = Integer.parseInt(S1[1]);
            String s2 = br.readLine().trim();
            String[] S2 = s2.split(" ");
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(S2[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.canPair(nums, k);
            if (ans)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        
        if(nums.length%2 ==1){
            return false;
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        
        int count = 0;
        for(int i:nums){
            i = i%k;
            if(i==0){
                count++;
            }
            al.add(i);
            if(hm.containsKey(i)){
                hm.replace(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        
        if(count%2!=0){
            return false;
        }
      
        for(int j:al){
            
            if(hm.containsKey(k-j) && hm.get(k-j)>0){
                hm.replace(k-j,hm.get(k-j)-1);
            }else if(j==0){
                
            }else{
                return false;
            }
        }
        return true;
        
    }
}