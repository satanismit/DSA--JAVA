import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public void insertLeft(Node root, int key) {
        if (root == null) {
            System.out.println("Root has no child !!");
            return;
        }
        Node newNode = new Node(key);
        if (root.left == null) {
            root.left = newNode;
        } else {
            newNode.left = root.left;
            root.left = newNode;
        }
    }

    public void deleteRight(Node root) {
        if (root == null || root.right == null) {
            System.out.println("Root has no right child !!");
            return;
        }
        root.right = null;
        System.out.println("Right child deleted.");
    }

    public void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelOrder() {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            System.out.print(temp.data + " ");
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);

        }
    }
}

public class t {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);

        tree.insertLeft(tree.root, 2);
        tree.insertLeft(tree.root, 3);
        tree.insertLeft(tree.root, 4);
        tree.root.right = new Node(5);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.print("Levelorder Traversal: ");
        tree.levelOrder();
        System.out.println();

        System.out.print("Delete Right: ");
        tree.deleteRight(tree.root);
        tree.levelOrder();
        System.out.println();
    }
}
