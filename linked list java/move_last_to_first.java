class node{               // to create  node of linked list for editing
    int info;
    node link;  
     node(int info)      
    {
        this.link=null;
        this.info=info;
    // System.out.println("one node created...yehh");
    }
}
    
public class move_last_to_first {
    public static void main(String[] args) {
        node n1 =new node(1);
        node n2 =new node(2);
        node n3 =new node(3);
        node n4 =new node(4);
        node n5 =new node(5);
        node head =n1;
        n1.link =n2;
        n2.link =n3;
        n3.link= n4;
        n4.link=n5;
        node cur = head;
        while(cur.link.link!=null)
        {
            cur=cur.link;
        }
       // node temp=new node(0);
       System.out.println(cur.info);
       System.out.println(cur.link.info);
     
        // System.out.println(head.info);
        // System.out.println(head.link.info);
       /// System.out.println(head.link.link.info);
    }
    
}