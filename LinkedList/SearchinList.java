import java.util.*;
class SearchinList{
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
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=null)
            temp=temp.next;
            temp.next=newnode;
        }
    }
    void search(int data){
        if(head==null){
            System.out.println("No ELEMENTS IN LL");
        }
        Node temp=head;
        if(head.data==data){
            System.out.println("Element FOUND at HEADDD!!!!");
        }int i=1;boolean flag=false;
        while(temp.next!=null){
            if(temp.data==data){
                i++;
                flag=true;break;
            }temp=temp.next;
            
        }
        if(flag){
            System.out.println("Element FOUND at "+i);
        }else{
            System.out.println("Element NOT FOUND !! ");
        }
    }
    public static void main(String[] args)
    {
        SearchinList list=new SearchinList();
        list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.insert(50);
	    list.search(6);
	    list.search(20);
    }
}









