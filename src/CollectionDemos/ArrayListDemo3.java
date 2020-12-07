package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();


        al.add(34);//0
        al.add(45);
        al.add(55);
        al.add(4.5);
        al.add('c');
        al.add("amol");
        al.add("rahul");

        System.out.println("al="+al);

        al.set(4,"xyz");

        System.out.println("al="+al);

    }
}
