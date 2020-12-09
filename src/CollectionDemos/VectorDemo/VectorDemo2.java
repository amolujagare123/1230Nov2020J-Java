package CollectionDemos.VectorDemo;

import java.util.Vector;

public class VectorDemo2 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        // default initial capacity of vector is 10

        System.out.println("size="+v.size());// 0
        System.out.println("capacity="+v.capacity());// 10

        v.add("amol");
        v.add("praful");
        v.add("sopan");
        v.add("amit");
        v.add("vikram");
        v.add("rahul");
        v.add("amol");
        v.add("praful");
        v.add("sopan");
        v.add("amit");
        v.add("amit");



        System.out.println("size="+v.size()); //
        System.out.println("capacity="+v.capacity());// 20

        v.add("amol");
        v.add("praful");
        v.add("sopan");
        v.add("amit");
        v.add("vikram");
        v.add("rahul");
        v.add("amol");
        v.add("praful");
        v.add("sopan");
        v.add("amit");
        v.add("amit");

        System.out.println("size="+v.size()); // 22
        System.out.println("capacity="+v.capacity());// 40

        System.out.println(v);



    }

}
