import java.util.*;
public class DeleteNode
{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    void insert(int data)
    {
        if(head==null){
            Node newnode=new Node(data);
            head=newnode;
        }else{
            Node newnode=new Node(data);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void delete(int data)
    {
        if(head==null){
            System.out.println("NO Elementsssss!!!!");
        }
        if (head.data==data){
            head=head.next;
            System.out.println("Deleted SUCCESSFULLYYYY!!!");
            return;
        }
        
        Node temp=head;
        while(temp.next!=null && temp.next.data != data){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Element NOT FOUND!!!");
        }else{
            temp.next=temp.next.next;
        }
        System.out.println("Deleted SUCCESSFULLYYYY!!!");
    }
    void display(){
        if (head==null){
            System.out.println("NO DATAAAAA!!!!!!!!!!!!!");
        }else{
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        }
    }
	public static void main(String[] args) {
	    DeleteNode list=new DeleteNode();
	    list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.insert(50);
	    list.display();
	    System.out.println();
	    list.delete(30);
	    list.display();
	}
}

