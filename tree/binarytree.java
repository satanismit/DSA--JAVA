import java.util.Scanner;

public class binarytree {
    Scanner sc=new Scanner(System.in);

    public static  node root;
    public static class node{
        int val;
        node left,right;

         node(int val)
        {
           this.val=val;
           this.right=null;
           this.left=null;
        }
    }
    static int roo=0;

    public void populate()
    {
        System.out.println("enter the root node:");
        int val=sc.nextInt();
        roo=val;
        root=new node(val);
        System.out.println("press t for --> true otherwise press ---> f");
        populate(root);
    }
   
    private void populate(node n)
    {
        
        System.out.println("do you want to enter left of node "+n.val);
        String  left=sc.next();
        if(left.equals("t"))
        {
            System.out.println("enter your value:");
            int val=sc.nextInt();
            n.left=new node(val);
            populate(n.left);
        }
        System.out.println("do you want to enter right of node "+n.val);
        String  right=sc.next();
        if(right.equals("t"))
        {
            System.out.println("enter your value:");
            int val=sc.nextInt();
            n.right=new node(val);
            populate(n.right);
        }
    }
    
    public void display()
    {
        display(root,"");
    }
   
    private void display(node n,String indent)
    {
        if(n==null)
        {
         return;
        }
        System.out.println(indent+ n.val);
        display(n.left,indent +"/t");
        display(n.right,indent+"/t");
    }
   
    public void preetydisplay()
    {
        preetydisplay(root,0);
    }
    
    private void preetydisplay(node n,int level)
    {
        if(n==null)  return;
        preetydisplay(n.right,level+1);
        if(level!=0)
        {
             for(int i=0;i<level-1; i++){
                System.out.print("|\t\t");
             }
             System.out.println("|---->"+n.val);
        }
        else{
            System.out.println(n.val);
        }
        preetydisplay(n.left,level+1);
    }

    public void preorder(node r)
    {
          System.out.print(r.val+" ");
          if(r.left!=null)
          {
            preorder(r.left);
          }
          if(r.right!=null)
          {
            preorder(r.right);
          }
          
    }

    public void postorder(node r)
    {
        
        if(r.left!=null)
        {
          preorder(r.left);
        }
        if(r.right!=null)
        {
          preorder(r.right);
        }
        System.out.print(r.val+" ");

    }   
    
    public void inorder(node r)
    {
        
        if(r.left!=null)
        {
            inorder(r.left);
        }
        System.out.print(r.val+" ");
        
        if(r.right!=null)
        {
            inorder(r.right);
        }
    }


    public static void main(String[] args) {
        binarytree tree=new binarytree();
        tree.populate();
        tree.preetydisplay();

        System.out.println("pre-order:");
        tree.preorder(root);
        System.out.println("post-order");
        tree.postorder(root);
        System.out.println("in-order");
        tree.inorder(root);

    }
}
