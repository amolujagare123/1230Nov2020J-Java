package CollectionDemos.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo4 {

    public static void main(String[] args) {

        Vector<String> v = new Vector<>();


        v.add("amol");
        v.add("praful");
        v.add("sopan");
        v.add("amit");
        v.add("vikram");
        v.add("rahul");

        System.out.println(v);
        System.out.println("using iterator");

        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\nusing enumeration");


        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.print(e.nextElement()+" ");

    }

}
