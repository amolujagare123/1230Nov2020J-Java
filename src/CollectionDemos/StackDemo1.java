package CollectionDemos;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        System.out.println("before adding elements:"+s.empty());//true

        s.push(12);
        s.push(22);
        s.push(32);
        s.push(13);
        s.push(15);

        System.out.println("After adding elements:"+s.empty());//false

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.pop()); // returns and removes top element

        System.out.println(s);

        System.out.println(s.peek());// returns top element but doesnt removes

        System.out.println(s);


    }

}
