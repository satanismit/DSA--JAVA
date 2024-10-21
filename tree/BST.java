import java.util.Scanner;

public class BST {
    public static class node {
        int val;
        node left = null;
        node right = null;

        node(int n) {
            val = n;
            this.left = null;
            this.right = null;
        }
    }

    public static node root = null;

    public void insert(int n) {
        root = insert(root, n);
    }

    private node insert(node root, int n) {

        if (root == null) {
            root = new node(n);
            return root;
        }

        if (root.val > n) {
            root.left = insert(root.left, n);

        } else if (root.val < n) {
            root.right = insert(root.right, n);
        }
        return root;

    }

    public void preetydisplay() {
        preetydisplay(root, 0);
    }

    private void preetydisplay(node n, int level) {
        if (n == null)
            return;
        preetydisplay(n.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|---->" + n.val);
        } else {
            System.out.println(n.val);
        }
        preetydisplay(n.left, level + 1);
    }

    public void delete(int n) {
        root = delete(root, n);
    }

    private node delete(node r, int n) {
        if (r == null) {
            return r;
        }
        if (r.val < n) {
            r.right = delete(r.right, n);
        } else if (r.val > n) {
            r.left = delete(r.left, n);
        } else // r.val==n
        {
            // in this else block we reach upto that node which we have to delete

            // if(r.left==null && r.right==null) //for no child node
            // {
            // return null;
            // }
            // for having one child or no child
            if (r.left == null)
                return r.right;
            if (r.right == null)
                return r.left;

            // for having two child (using successor)
            // r.val=findsuccessor(r.right);
            // r.right=delete(r.right,r.val);

            // for having two child (using predecessor)
            r.val = findpredecessor(r.left);
            r.left = delete(r.left, r.val);

        }
        return r;
    }

    private int findsuccessor(node cur) {
        // node cur=root;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur.val;
    }

    private int findpredecessor(node cur) {
        while (cur.right != null) {
            cur = cur.right;
        }
        return cur.val;
    }

    public static int maxheight(){
        int n=maxheight(root);
        return n;
    }

    private static int maxheight(node root){

        if(root==null) return 0;
        int lval=maxheight(root.left);
        int rval=maxheight(root.right);

        return 1+Math.max(lval,rval);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("how many elements you want to add in BST:");
        int j = sc.nextInt();
        int[] obj = new int[j];

        System.out.print("enter elments :");
        for (int i = 0; i < j; i++) {
            obj[i] = sc.nextInt();
        }
        BST n = new BST();
        for (int i = 0; i < j; i++) {
            n.insert(obj[i]);
        }
        n.preetydisplay();
        // System.out.println("enter element which you want to delete:");
        // int s = sc.nextInt();
        // n.delete(s);
        // n.preetydisplay();
       int m= BST.maxheight();
       System.out.println();
       System.out.println(m);


        sc.close();

    }
}
