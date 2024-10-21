public class queueLL {
    class node {
        int data;
        node next;

        node(int n) {
            this.data = n;
            this.next = null;
        }
    }

    node R = null;
    node F = null;

    void enqueue(int n) {
        node temp = new node(n);
        if (F == null) {
            F = temp;
        }
        if (R == null) {
            R = temp;
            return;
        }
        R.next = temp;
        R = temp;

    }

    int dequeue() {
        if (F == null) {
            System.out.println("underflow your queue..");
            return 0;
        }
        int x = F.data;

        if (F.next == null) {
            F = null;
        } else {
            F = F.next;
        }
        return x;

    }

    void show() {
        node temp = F;
        System.out.println("your output: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        queueLL obj = new queueLL();
        obj.enqueue(10);
        obj.enqueue(11);
        obj.enqueue(12);
        obj.enqueue(13);
        obj.show();
        obj.dequeue();
        obj.show();
        obj.dequeue();
        obj.show();
    }
}
