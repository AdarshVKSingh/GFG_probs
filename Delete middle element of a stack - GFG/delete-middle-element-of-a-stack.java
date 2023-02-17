//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int mid;
        if(sizeOfStack%2==0){
         mid = (int)((sizeOfStack)/2);  
        }else{
           mid = (int)((sizeOfStack+1)/2);
        }
        
        int k = mid;
        Stack<Integer> arr = new Stack<>();
        if(sizeOfStack%2==0){
            while(k>0){
            arr.push(s.pop());
            k--;
             }
        }else{
              while(k>1){
                arr.push(s.pop());
                k--;
             }
        }
        
        int b =s.pop();
        while(!arr.isEmpty()){
            s.push(arr.pop());
        }
    } 
}

