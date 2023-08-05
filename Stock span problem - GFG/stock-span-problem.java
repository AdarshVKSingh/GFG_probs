//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        
        int arr[] = new int[n];
        // Arrays.fill(arr,1);
        
        // for(int i=1;i<n;i++){
        //     int key = price[i];
        //     int k = i;
        //     while(k>=1){
                
        //         if(price[k-1] <= key){
        //           // System.out.println("inside");
        //             arr[i] = arr[i]+1;
        //         }else{
        //             break;
        //         }
                
        //         k--;
        //     }
        // }
        // return arr;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            
            while(!s.isEmpty() && price[s.peek()]<= price[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                arr[i] = i+1;
            }else{
                arr[i] = i- s.peek();
            }
            
            s.push(i);
        }
        return arr;
        
    }
    
}