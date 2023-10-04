//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int total = 0;
        for(int i=str.length()-1;i>=0;i--){
            
            if(i==str.length()-1 || hm.get(str.charAt(i))>=hm.get(str.charAt(i+1))){
                
                total += hm.get(str.charAt(i));
            }else{
                total -= hm.get(str.charAt(i));
            }
        }
        
        return total;
    }
}