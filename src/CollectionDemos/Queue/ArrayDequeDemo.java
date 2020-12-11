package CollectionDemos.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offer(13);
        adq.offer(21);
        adq.offer(33);
        adq.offer(103);
        adq.offer(231);
        adq.offer(3);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);
        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();
        System.out.println(adq);

    }
}
