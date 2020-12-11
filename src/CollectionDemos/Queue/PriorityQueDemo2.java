package CollectionDemos.Queue;

import java.util.PriorityQueue;

public class PriorityQueDemo2 {


    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(23);
        pq.offer(13);
        pq.offer(21);
        pq.offer(33);
        pq.offer(103);
        pq.offer(231);
        pq.offer(3);

        System.out.println(pq);
        // [ 3, 13 , 21 , 23 ,33 , 103, 231]

        // some operating systems / compilers doest not support priority queue
        // so the display output is incorrect
        // but internally it is stored in correct way

        System.out.println(pq.poll()); // 3
        System.out.println(pq.poll()); // 13
        System.out.println(pq.poll()); // 21
        System.out.println(pq.poll()); // 23
        System.out.println(pq.poll()); // 33
        System.out.println(pq.poll()); // 103
        System.out.println(pq.poll()); // 231
    }



}
