    public static  Node insert(Node head,int data) {
        //Complete this method
        if(head!=null)
            {
        Node n=new Node(data);
        Node t=head;
            while(t.next!=null)
            {
                t=t.next;
            }
            t.next=n;
        n.next=null;
        return head;
    }
            
        else
            {
            Node n=new Node(data);
            head=n;
            n.next=null;
        }
        return head;
    }