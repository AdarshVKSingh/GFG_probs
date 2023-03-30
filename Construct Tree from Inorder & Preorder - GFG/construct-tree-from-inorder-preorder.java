//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}
// } Driver Code Ends


class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        HashMap<Integer,Integer> inmap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inmap.put(inorder[i],i);
        }
        
        Node root = buildTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1,inmap);
        return root;
    }
    
    static Node buildTree(int[] inorder,int ins,int ine,int[] preorder, int pres,int pree,HashMap<Integer,Integer> inmap){
        
        if(ins>ine||pres>pree){
            return null;
        }
        
        Node root = new Node(preorder[pres]);
        
        //int root_ind = inmap.get(preorder[pres]);
        int root_ind = search(inorder,preorder[pres],ins);
        int left_count = root_ind - ins;
        
        root.left = buildTree(inorder,ins,root_ind-1,preorder,pres+1,pres+left_count,inmap);
        root.right =buildTree(inorder,root_ind + 1,ine,preorder,pres + left_count + 1 ,pree,inmap);
        return root;
    }
    
    static int search(int[] arr,int val,int start){
        for(int i=start;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        
        return -1;
    }
}
