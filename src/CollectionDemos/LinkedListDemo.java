package CollectionDemos;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList ll =new LinkedList();

        ll.add("amol");
        ll.add("rahul");
        ll.add("jitendra");
        ll.add("kalyani");
        ll.add("vaishali");

        // maintains insertion order

        System.out.println(ll);

        ll.addFirst("FIRST");

        ll.addLast("LAST");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

    }

}
