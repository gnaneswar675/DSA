class InserAtHead{

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    void insertathead(Node old,int data){
        Node newnode=new Node(data);
        newnode.next=old;
        head=newnode;
    }
    void insert(int data){
        if(head==null){
            Node newnode=new Node(data);
            head=newnode;
        }else{
            Node v=new Node(data);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=v;
        }
    }
    void display(){
        if(head==null){
            System.out.println("Empty!!!!");
        }else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"  ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        InserAtHead list=new InserAtHead();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Before Insertion at head:");
        list.display();
        list.insertathead(list.head,5);
        System.out.println("\nAfter Insertion at head:");
        list.display();
    }
}
