//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int i = Arrays.binarySearch(arr,0,n,x);
        
        if(i<0){
            al.add(-1);
            al.add(-1);
            return al;
        }
        
        //System.out.println(i);
        int last=i,first=i;
        int j = i;
        if(j+1<n && arr[j+1]==x){
            last = j+1;
            while(j+1<n && arr[j+1]==x){
                j = j+1;
            }
            last = j;
            
        }
        j = i;
        if(j-1>=0 && arr[j-1]==x){
            first = j-1;
            while(j-1>=0 && arr[j-1]==x){
                j = j-1;
            }
            first = j;
            
        }
        
        al.add(first);
        al.add(last);
        return al;
        
        
        
    }
}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Integer> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends