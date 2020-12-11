package CollectionDemos.Queue;

import java.util.PriorityQueue;

public class PriorityQueDemo3 {


    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.println("using element method="+pq.element());

       // System.out.println(pq.peek());
        pq.offer(23);
        pq.offer(13);
        pq.offer(21);
        pq.offer(33);
        pq.offer(103);
        pq.offer(231);
        pq.offer(3);

        System.out.println(pq);
        System.out.println(pq.peek());

        System.out.println("using element method="+pq.element());

        System.out.println(pq);
    }



}
