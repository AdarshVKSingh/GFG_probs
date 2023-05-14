//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    
	  public boolean findTriplets(int arr[] , int n)
    {
        
         boolean found=false;
         for(int i=0;i<n-1;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int x=-(arr[i]+arr[j]);
                if(hs.contains(x)){
                    return true;
                }else{
                    hs.add(arr[j]);
                }
            }
        }
        return false;
    }
}
