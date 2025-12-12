class Middle{
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
    int middlenode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;            
            
        }
        return slow.data;
        }
        
    
    public static void main(String args[])
    {
        Middle list=new Middle();
        list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.insert(50);
	    System.out.println(list.middlenode(list.head));
	    
    }
}
