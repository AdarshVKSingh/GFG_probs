//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0;i<k;i++){
            if(hm.containsKey(A[i])){
               
                hm.put(A[i],hm.get(A[i])+1);
            }else{
                hm.put(A[i],1);
            }
        }
        
        al.add(hm.size());
        
        for(int i=k;i<n;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0) +1);
            hm.put(A[i-k],hm.get(A[i-k])-1);
            
            if(hm.get(A[i-k])==0){
                hm.remove(A[i-k]);
            }
            
            al.add(hm.size());
        }
        
        return al;
    }
}

