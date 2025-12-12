class Cycles{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.next=null;
            this.data=data;
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
    
    void checkcycle(Node head){
        Node slow=head;
        Node fast=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow ==fast){
                flag=true;break;
            }
        }
        if (flag)
        System.out.println("Yepppp!!!");
        else{
            System.out.println("NO cyclessssssss");
        }
    }
    void createCycle(int pos) {
        if (pos<0) return;

        Node temp=head,cycleNode=null;
        int count=0;

        while (temp.next!=null) {
            if (count==pos)
                cycleNode=temp;
            temp=temp.next;
            count++;
        }
        temp.next=cycleNode; 
    }
     public static void main(String arge[]){
        Cycles list=new Cycles();
        list.insert(23);
	    list.insert(32);
	    list.insert(40);
	    list.insert(-4);
	    list.checkcycle(list.head);
	    list.createCycle(2);
	    list.checkcycle(list.head);
	    
    }
}
