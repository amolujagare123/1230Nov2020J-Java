package CollectionDemos;

import java.util.TreeSet;

public class TreeeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("praful");
        ts.add("amol");
        ts.add("sopan");
        ts.add("amit");
        ts.add("prakash");
        ts.add("rahul");
        ts.add("sandeep");

        System.out.println(ts);

        System.out.println(ts.add("rahul"));



    }
}
