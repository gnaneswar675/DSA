class InsertAtposition{
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
    Node insertmiddle(Node head,int data,int position){
        Node newnode=new Node(data);
        if (position==0){
            newnode.next=head;
            return newnode;
        }
        int count=0;
        Node temp=head;
        while(count<position-1 && temp!=null)
        {
            count++;
            temp=temp.next;
        }
        
        newnode.next=temp.next;
        temp.next=newnode;
        
        return head;
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
    public static void main(String args[])
    {
        InsertAtposition list=new InsertAtposition();
        list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.insert(50);
	    list.display();
	    list.head=list.insertmiddle(list.head,70,2);
	    System.out.println();
	    list.display();
    }
    
}
