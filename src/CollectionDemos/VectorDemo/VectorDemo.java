package CollectionDemos.VectorDemo;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        v.add("amol");
        v.add("praful");
        v.add("sopan");
        v.add("amit");
        v.add("vikram");
        v.add("rahul");

        System.out.println(v);

        Object[] arr =  v.toArray();
        System.out.println("using converted array");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }

}
