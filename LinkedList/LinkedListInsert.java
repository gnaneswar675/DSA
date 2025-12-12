import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
static class LinkedListInsert
{
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
    Node head=null;
    public void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    
    public void display(){
        if(head==null)
        {
            System.out.println("Empty!!!!");
        }
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"     ");
                temp=temp.next;
            }
        }
    }
    
    
	
}
public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    Codechef.LinkedListInsert list=new Codechef.LinkedListInsert();
	    int n=s.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int a=s.nextInt();
	        list.insert(a);
	    }
	    list.display();
	}

}
