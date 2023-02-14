//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        
      int pos[] = new int[n];
      int neg[] = new int[n];
      
      int posc=0,negc = 0;
      
      for(int i=0;i<n;i++){
          if(arr[i]>=0){
              pos[posc] = arr[i];
              posc++;
          }else{
              neg[negc] = arr[i];
              negc++;
          }
      }
      if(posc==0 || negc==0){
          return;
      }
      
      if(posc>negc){
          int t = 1;
          for(int i=0;i<negc;i++){
              arr[t] = neg[i];
              t+=2;
          }
          int m = 0,curr=0;
          for(int j=0;j<negc;j++){
              arr[m] = pos[j];
              m+=2;
              curr = j;
          }
          for(int a = m;a<n;a++){
              arr[a] = pos[curr+1];
              curr++;
          }
      }else{
          int t=0;
          for(int i=0;i<posc;i++){
              arr[t] = pos[i];
              t+=2;
          }
          int m=1,curr=0;
          for(int j=0;j<posc;j++){
              arr[m] = neg[j];
              m+=2;
              curr = j;
          }
          for(int a = m-1;a<n;a++ ){
              arr[a]  = neg[curr+1];
              curr++;
          }
          
      }
      
      
       
        
    }
}