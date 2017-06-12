    public static Node removeDuplicates(Node head) {
      //Write your code here
        Node temp=head;
        while(temp.next!=null)
            {
            if(temp.data==temp.next.data)
                {
                Node t=temp.next;
                temp.next=t.next;
                t.next=null;
                continue;
            }
            temp=temp.next;
        }
        return head;
    }