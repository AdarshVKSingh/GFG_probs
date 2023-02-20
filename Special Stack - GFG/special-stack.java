//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}
// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    
    public int min_ele = Integer.MAX_VALUE;
    public int max_ele = Integer.MIN_VALUE;
    
	public void push(int a,Stack<Integer> s)
	{
	   
	    if(a>max_ele){
	        max_ele = a;
	    }
	    if(a<min_ele){
	        min_ele = a;
	    }
	    
	    s.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           if(s.isEmpty()){
               return -1;
           }
           
           return min_ele;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
         
         if(s.size()==n){
             return true;
         }  
         return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           return s.isEmpty();
	}
}