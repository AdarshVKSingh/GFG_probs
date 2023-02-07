//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        int count0=0,count1 = 0,count2 = 0;
        Node a = head,b = head;
        while(a!=null){
            if(a.data==0){
                count0++;
            }
            if(a.data==1){
                count1++;
            }
            if(a.data==2){
                count2++;
            }
            a  = a.next;
            
        }
        int count=0;

        while(b!=null){
            if(count<count0){
                b.data = 0;
                
            }
            if(count>=count0 && count<count0+count1){
                b.data = 1;
               
            }
            if(count>=count0+count1 && count<count0+count1+count2){
                b.data = 2;
              
            }
            count++;
            b = b.next;
        }
        return head;
    }
}


