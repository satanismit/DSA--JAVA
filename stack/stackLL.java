import java.util.Scanner;

public class stackLL {

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
        System.out.print("after that your linked list ---------> ");
        while(trav!= null)
        {
            System.out.print(trav.info+" ");
            trav=trav.link;
        } 
        
    }

    public void pop()
    {
        if(head==null)
        {
            return ;
        }
        node temp =head;
        head=temp.link;
        System.out.println("ohhhh.....first node destroyed");
    }
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        stackLL obj=new stackLL();
        System.out.println("If you want to push enter ---1");
        System.out.println("If you want to pop enter --- 2");
        System.out.println("for exit enter ---0");
        int n;
    
       do{
        System.out.println("\n enter for push and pop :");

        n =sc.nextInt();
        if(n==1)
        {
            
            System.out.println("enter value to push :");
            int k=sc.nextInt();
            obj.push(k);
            obj.display();
        }
        else if(n==2)
        {
            obj.pop();
            obj.display();
        }
       
       }while(n!=0);
       sc.close();

    }

}
