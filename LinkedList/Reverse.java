class Reverse{
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
    Node reverse(Node head){
        Node prev=null;
        Node cur=head;
        while(cur!=null){
            Node temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
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
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }System.out.print("NULL");
        }
    }
    public static void main(String args[])
    {
        Reverse list=new Reverse();
        list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.insert(50);
	    list.display();
	    System.out.println();
	    list.head=list.reverse(list.head);
	    list.display();
	    
	    
    }
}
