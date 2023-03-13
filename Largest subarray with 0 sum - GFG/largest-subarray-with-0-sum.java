//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int sum = 0;
        int max_len = 0;
        for(int i=0;i<n;i++){
            sum+= arr[i];
            
            if(sum==0){
                max_len = i+1;
            }else{
                if(hm.containsKey(sum)){
                max_len = Math.max(max_len,i-hm.get(sum));
            }else{
                hm.put(sum,i);
            }
            }
            
        }
        
        return max_len;
    }
}