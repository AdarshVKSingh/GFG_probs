//{ Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
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




class MyQueue {

    static int front, rear;
	static int arr[] = new int[100005];

    MyQueue()
	{
		front=-1;
		rear=-1;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    if(isFull()){
	        return;
	    }
	    if(front==-1){
	        front = rear = 0;
	    }else{
	        rear++;
	    }
	    
	    arr[rear] = x;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		if(isEmpty()){
		    return -1;
		}
		int b = arr[front];
		front++;
		if(front>rear){
		    front = rear = -1;
		}
		
		return b;
	}
	
	static boolean isEmpty(){
	    
	    if(front==-1 ||front==100004){
	        return true;
	    }
	    return false;
	}
	
	static boolean isFull(){
	    if( rear==100004){
	        return true;
	    }
	    return false;
	}
}




