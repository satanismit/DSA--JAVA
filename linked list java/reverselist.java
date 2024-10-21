public class reverselist
{
    static class node {
        int data;
        node next;
        public node(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }
  
    public static void travel(node head) {
        node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static node reverse(node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        node prev=head;
        node cur=head.next;

        while(cur!=null)
        {
            node next=cur.next;
            cur.next=prev;

            prev=cur;
            cur=next;
        }
        head.next=null;
        head=prev;
        return head;
    }
        public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);
        node n5 = new node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;     
        n1=reverse(n1);
        // n1 = midtofront(n1);
         travel(n1);
    }
}