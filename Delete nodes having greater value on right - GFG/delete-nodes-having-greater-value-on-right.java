//{ Driver Code Starts
import java.util.*;

class Node
{

    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        Node a = reverse(head);
        
        int max = a.data;
        Node prev = a;
        Node temp = a.next;
        while(temp!=null ){
            if(temp.data<max){
                prev.next = prev.next.next;
                temp = prev.next;
                
            }else{
                max = temp.data;
                prev = temp;
                temp = temp.next;
            }
        }
        
        Node b = reverse(a);
        return b;
    }
    
    Node reverse(Node head){
        
        Node prev=null,curr=head,next=null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            
            curr = next;
        }
        
        return prev;
    }
    
    
}
  