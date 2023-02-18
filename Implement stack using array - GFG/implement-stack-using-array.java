//{ Driver Code Starts
import java.util.*;

import java.io.*;
import java.lang.*;

class GfG {

	public static void main(String args[])throws IOException
	{
// 		 Scanner sc = new Scanner(System.in);
// 		 int t=sc.nextInt();
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(read.readLine());
         
		 while(t>0)
		 {
			MyStack obj = new MyStack();
			int Q = Integer.parseInt(read.readLine());
			int k = 0;
			String str[] = read.readLine().trim().split(" ");
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = Integer.parseInt(str[k++]);
				if(QueryType == 1)
				{
					int a = Integer.parseInt(str[k++]);
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}




// } Driver Code Ends



class MyStack
{
    static int top;
	static int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    static void push(int a)
	{
	    if(isFull()){
	        return;
	    }
	    if(top==-1){
	       top= 0;
	        arr[top] = a;
	        
	    }else{
	        top++;
	        arr[top] = a;
	        
	    }
	} 
	
    //Function to remove an item from top of the stack.
	static int pop()
	{
        if(isEmpty()){
            return -1;
            
        }
        int b = arr[top];
        top--;
        return b;
	}
	
	static boolean isEmpty(){
	    if(top==-1){
	        return true;
	    }
	    return false;
	}
	static boolean isFull(){
	    if(top==999){
	        return true;
	    }
	    return false;
	}
}