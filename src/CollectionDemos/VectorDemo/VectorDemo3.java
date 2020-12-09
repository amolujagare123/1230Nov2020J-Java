package CollectionDemos.VectorDemo;

import java.util.Vector;

public class VectorDemo3 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(4,2);

        // default initial capacity of vector is 10

        System.out.println("size="+v.size());// 0
        System.out.println("capacity="+v.capacity());// 4

        v.add("amol");
        v.add("praful");
        v.add("sopan");
        v.add("amit");
        v.add("vikram");


        System.out.println("size="+v.size()); // 5
        System.out.println("capacity="+v.capacity());// 6

        v.add("amit");
        v.add("vikram");

        System.out.println("size="+v.size()); // 5
        System.out.println("capacity="+v.capacity());// 8



        System.out.println(v);



    }

}
