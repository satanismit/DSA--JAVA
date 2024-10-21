import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
public class queueJCF {
    public static void main(String[] args) {
        Queue<String> q=new LinkedList<String>();
        q.offer("smit");
        q.add("satani");
      // q.offer();//
        System.out.println(q);
        q.offer("raj");
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.remove();
        q.remove();
        q.poll(); //return null 
       // q.remove();//throw exception --> java.util.NoSuchElementException 
        System.out.println(q);

    }
}
// public class queueJCF {
//   public static void main(String[] args) {
//       Queue<Integer> q=new PriorityQueue<Integer>();
//       q.offer(10);
//       q.offer(11);
      
//       System.out.println(q);
//       q.offer(12);
//       System.out.println(q);
//       q.remove();
//       System.out.println(q);
//       q.remove();
//       q.remove();
//       q.poll(); //return null 
     
//       System.out.println(q);

//   }
// }
