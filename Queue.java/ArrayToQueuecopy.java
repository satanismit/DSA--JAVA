import java.util.*;
public class ArrayToQueuecopy{

public static void main(String[] args) {
// Create an array of String objects
String city[] = {"CCU","DEL","BLR","MUM","GAU"};

// Declare a queue
Queue<String> queue = new PriorityQueue<String>();
Queue<Integer> q=new PriorityQueue<Integer>();

q.add(23);
q.add(12);
q.add(10);
System.out.println(q);
q.poll();
System.out.println(q);

// Copying the array to Queue

Collections.addAll(queue, city);
// Printing the array
// System.out.print("Array :");
// for(String  i:city)
// {
//     System.out.print(i+" ");
// }
// System.out.println();
// // Printing the queue
// System.out.println("Queue :" + queue);
// System.out.println(queue);
// queue.poll();
// System.out.println(queue);
// queue.poll();
// System.out.println(queue);
// queue.poll();
// queue.poll();
// System.out.println(queue);
ArrayDeque<Integer> adq=new ArrayDeque<Integer>();

adq.addFirst(12);
adq.addLast(67);
System.out.println(adq.peek());

}
}