//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> arr1 = new ArrayList<>();
        long i=-1,j=-1;
        int found=0;
        for(int a = 0;a<n;a++){
            if(arr[a]==x){
                if(found==0){
                    i=a;
                    j = a;
                    found = 1;
                }else{
                    j = a;
                }
            }
        }
        arr1.add(i);
        arr1.add(j);
        return arr1;
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
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends