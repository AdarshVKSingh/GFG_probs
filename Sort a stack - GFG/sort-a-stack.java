//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/

class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
	    
		Stack <Integer> s1  =  new Stack<>(); 
		while(!s.isEmpty())
		{
		    int ele = s.pop();
		    insertSorted(s1,ele);
		}
		return s1;
	}
	
	public static void insertSorted(Stack<Integer> s,int ele){
	   
	    if(s.isEmpty()){
	        s.push(ele);
	        return ;
	    }
	    
	    if( s.peek()> ele){
	        int b = s.pop();
	        insertSorted(s,ele);
	        s.push(b);
	    }else{
	        s.push(ele);
	    }
	    
	    
	    
	}
}