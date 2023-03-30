//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class InorderPostorderToTree {
    public void preOrder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++) inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++) postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

// } Driver Code Ends


/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    //Function to return a tree created from postorder and inoreder traversals.
   public static Node buildTree(int inorder[], int postorder[], int n)
    {
        
        
        Node root = buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
        return root;
    }
    
    static Node buildTree(int[] inorder,int ins,int ine,int[] postorder, int posts,int poste){
        
        if(ins>ine||posts>poste){
            return null;
        }
        
        Node root = new Node(postorder[poste]);
        
        //int root_ind = inmap.get(preorder[pres]);
        int root_ind = search(inorder,postorder[poste],ins);
        int left_count = root_ind - ins;
        
        root.left = buildTree(inorder,ins,root_ind-1,postorder,posts,posts+left_count-1);
        root.right =buildTree(inorder,root_ind + 1,ine,postorder,posts + left_count ,poste-1);
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
