import java.util.*;

class Book implements Comparable<Book> {

    int bookId, quantity;
    String name, author, publisher;

    public Book(int id, String name, String author, String pub, int qty) {
        bookId = id;
        this.name = name;
        this.author = author;
        publisher = pub;
        quantity = qty;
    }

    public int compareTo(Book b) {
        if (bookId > b.bookId)
            return 1;
        else if (bookId < b.bookId)
            return -1;
        else
            return 0;
    }
}

public class userdefinedobj {
    public static void main(String[] args) {
        PriorityQueue<Book> queue = new PriorityQueue<Book>();

        // Creating Books
        Book b1 = new Book(111, "Joy with Java", "Debasis Samanta", "Elsevier", 8);
        Book b2 = new Book(222, "Complete Java", "Herbert Schildt", "Oracle", 6);
        Book b3 = new Book(333, "Headstart Java", "Forouzan", "O’Reilly", 4);

        // Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println(queue);
        System.out.println("Traversing the queue elements:");

        // Traversing queue with for-each loop
        for (Book b : queue) {
            System.out.println(b.bookId + " " + b.name + " " + b.author + " " + b.publisher + "" + b.quantity);
        }
        queue.poll();
        System.out.println("After removing one book record:");

        // Adding another book into the queue
        queue.add(new Book(555, "Classic Data Structures", "D. Samanta", "Prentice Hall", 9));
        for (Book b : queue) {
            System.out.println(b.bookId + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
