package CollectionDemos;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(12);
        s.push(22);
        s.push(32);
        s.push(13);
        s.push(15);

        System.out.println(s);

        System.out.println(s.search(15));

        System.out.println(s.search(22));




    }

}
