class LengthofList{
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
    void length(){
        if(head==null){
            System.out.println("NO ELEMENTSSSS IN LISTTT");
        }
        int c=1;
        Node temp=head;
        while(temp.next!=null){
            c++;
            temp=temp.next;
        }
        System.out.println("Length of LIST isss "+c);
    }
    void display(){
        if(head==null){
            System.out.println("NO ELEMENTSSSS IN LISTTT");
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"  ");
            temp=temp.next;
        }
    }
    public static void main(String arge[]){
        LengthofList list=new LengthofList();
        list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.insert(50);
	    list.display();
	    list.length();
    }
}









