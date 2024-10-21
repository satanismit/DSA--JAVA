public class move_mid_to_front {
    static class node {
        int data;
        node next;
        public node(int data) {
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
        System.out.println("null");
    }
    public static node midtofront(node head) {
        node current1 = head;
        int count=0;
        int mid;
        while (current1 != null) {
            System.out.print(current1.data + " ");
            current1 = current1.next;
            count++;
        }
        
        System.out.println("null");
        if(count%2==0) {
            mid=(count+2)/2;
        }
        else {
            mid = (count+1)/2;
        }
        
        System.out.println("MID point : " +mid);
        
        if (head==null) {
            System.out.println("LL is empty");
        }
        node current2 = head;
       for (int i = 0 ; i<mid-2 ; i++) {
        current2=current2.next;
       }

       node temp = new node(0);
        
        temp=current2.next;
        temp.data=current2.next.data;
        current2.next=current2.next.next;
        temp.next=head;
        head=temp;
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

    
        n1 = midtofront(n1);
        travel(n1);
       

        
    }
}