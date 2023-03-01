//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        
        Arrays.sort(arr, new Comparator<Item>(){
            public int compare(Item i1,Item i2){
                double a = (double)i1.value/i1.weight;
                double b = (double)i2.value/i2.weight;
                
                return b<a ? 1:-1;
                
            }
        });
        
        double p = 0;
        int i;
        for(i=0;i<n;i++){
            if(arr[n-i-1].weight<=W){
                W = W- arr[n-1-i].weight;
                arr[n-1-i].weight = 0;
                p+= arr[n-i-1].value;
                //System.out.println(p);
            }else{
                break;
            }
        }
        
        if(W>0 && i!=n){
            p += ((double)W/arr[n-i-1].weight)*(arr[n-i-1].value);
        }
        
        return p;
    }
    
   


}