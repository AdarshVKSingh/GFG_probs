//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        
        for(int k = 1;k<=N;k++){
            int carry = 0,size = arr.size(),prod=0;
        
            for(int i=0;i<size;i++){
                prod = arr.get(size-i-1) * k + carry;
                carry = prod/10;
                prod = prod%10;
                arr.set(size-i-1,prod);
            }
            
            while(carry!=0){
                
                arr.add(0,carry%10);
                carry =  carry/10;
            }
        }
        
        return arr;
    }
    
    static ArrayList<Integer> multiply(ArrayList<Integer> arr,int k){
        int carry = 0,size = arr.size(),prod=0;
        
        for(int i=0;i<size;i++){
            prod = arr.get(size-i-1) * k + carry;
            carry = prod/10;
            prod = prod%10;
            arr.set(size-i-1,prod);
        }
        
        if(carry!=0){
            arr.add(0,carry);
        }
        return arr;
    }
}