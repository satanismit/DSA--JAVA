import java.util.Scanner;

public class linkedlist {

    class node{               // to create  node of linked list for editing
        int info;
        node link;  
         node(int info)      
        {
            this.link=null;
            this.info=info;
        }
    }
    node head=null;

    public void push(int info)
    {
        node temp =new node(info);      //create temporary pointer
        // every time create a new temp poniter to point a new node 

        if(head==temp)
        {                          //if there is first node
            head=temp;
            return;
        }
        else   
        {
            temp.link=head;
            head=temp;     
        }

    }

    public void display()
    {
        node trav=head;
        System.out.print("after that your stack  ---------> ");
        while(trav!= null)
        {
            System.out.print(trav.info+" ");
            trav=trav.link;
        } 
        
    }

    public int  pop()
    {
        if(head==null)
        {
            return 0;
        }
        node temp =head;
        head=temp.link;
        int x=temp.info;
        System.out.println("ohhhh.....one elemet poped");
        return x;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
          linkedlist obj =new linkedlist();
          obj.push(2);
          obj.push(3);
         int a = obj.pop();
         obj.push(4);
         int b=obj.pop();
         System.out.println("value that are pop: "+a+" "+b);
         System.out.println("your remaining stack:");
         obj.display();
         sc.close();
         
    }
}
