import java.util.Scanner;
public class basicnode {

    class node{               // to create  node of nexted list for editing
        int data;
        node next; 
        node(){} 
         node(int data)      
        {
            this.next=null;
            this.data=data;
         System.out.println("one node created...yehh");
        }
    }
         node head=null;      //globaly declare 
    public void addfirst(int data)
    {
        node temp =new node(data);      //create dummy node
        // every time create a new temp poniter to point a new node 
        if(head==temp)
        {                          //if there is first node
            head=temp;
            return;
        }
        else   {
            temp.next=head;
            head=temp;     
        }
    }

    public void addlast(int data)
    {
        node temp = new node(data);

        if(head==temp)
        {                          //if there is first node
            head=temp;
            return;
        }
        node trav=head;
  
        while(trav.next!= null)
        {
            trav=trav.next;
        }
        trav.next=temp;
    }

    public void addmid(int data,int x)
    {
        node n1 =new node(data);
        node trav = head;
        if(trav.data == x)
        {
            addfirst(data);
        }
        else
        {
        while(trav.next.data!=x)
          {
            trav=trav.next;
          }
        n1.next=trav.next;
        trav.next=n1;
        }    
    }
    
    public node display()
    {
        node trav=head;
        System.out.print("after that your nexted list ---------> ");
        if(trav==null)
        {
            return head;
        }
        while(trav!= null)
        {
            System.out.print(trav.data+" ");
            trav=trav.next;
        } 
        
        return head;
    }

    public void deletefirst()
    {
        if(head==null)
        {
            return ;
        }
        node temp =head;
        head=temp.next;
        temp=null;
        System.out.println("ohhhh.....first node destroyed");
    }

    public void deletelast()
    {
       node temp=head;
      
       if(temp.next==null)
       {
        temp.data=0;
        System.out.println("ohh...... you deleted your nexted list");
       }
      
       while(temp.next.next!=null)
       {
        temp=temp.next;
       }
       temp.next=null;
       System.out.println("ohh...... you deleted last node");
    }

    public node removeNthFromEnd( int n) {
        int count=0;
        node cur=head;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        if(head.next==null)
        {
            head=null;
            return head;
        }
        int count2=1;
        cur=head;

        while(cur!=null)
        {
            if(count==n)  //condition for remove first node 
            {
                head=head.next;
                break;
            }
            if(count2==count-n)
            {
                if(cur.next.next!=null)
                {
                     cur.next=cur.next.next;

                }
                else {
                    cur.next=null;
                }
               
            }
            cur=cur.next;
            count2++;
        }
        return head;
    }
    
    public node deletemid(int n)    // argument
    {
        
        int count=1;
        node trav =head;
        
        if(n==1)
        {
            deletefirst();
            return head;
        }
        
        while(count!=n)
        {
            count++;
            trav=trav.next;
        }
        if(trav.next.next==null)
        {
            deletelast();
        }
        else
        {
            trav.next=trav.next.next;
        }
        return head;
       

    }
    
    public void deleteall()
    {
        
        while(head!=null)
        {
            node temp=head.next;
            head=null;
            head=temp;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        basicnode obj =new basicnode();

        System.out.println("how many node you want to create:");
        int n=sc.nextInt();
       
        for(int i=0;i<n; i++)
        {
            System.out.println("enter elemets "+(i+1));
            int s=sc.nextInt();
            obj.addfirst(s);
        }
        obj.display();
        // obj.deletelast();
        // obj.display();
        // System.out.println("enter which element you want to delete at the last :");
        // int c =sc.nextInt();
        // obj.removeNthFromEnd(c);
        // obj.display();
        // System.out.println("after you delete all:");
        // obj.deleteall();
        // obj.display();
        sc.close();
    }
}



