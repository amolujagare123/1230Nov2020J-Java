package CollectionDemos.Queue;

import java.util.PriorityQueue;

public class PriorityQueDemo {


    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
       // System.out.println(pq.remove());

      //  System.out.println(pq.poll());


        pq.offer(23);
        pq.offer(13);
        pq.offer(21);
        pq.offer(33);
        pq.offer(103);
        pq.offer(231);
        pq.offer(3);

        System.out.println(pq);

        //System.out.println(pq.remove());
        System.out.println(pq.poll());

        System.out.println(pq);


    }



}
