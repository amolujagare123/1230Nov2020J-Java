package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        System.out.println(al.isEmpty()); //true

        al.add(34);
        al.add(45);
        al.add(55);
        al.add(4.5);
        al.add('c');
        al.add("amol");
        al.add("rahul");

        System.out.println("al="+al);
        System.out.println(al.isEmpty()); // false

        //   al.remove(1);

        ArrayList al1 = new ArrayList();

        al1.add(12);
        al1.add(32);
        al1.add('g');
        al1.add(1.2);

        al1.add(55);
        al1.add(4.5);
        al1.add('c');
        al1.add("amol");

        System.out.println("al1="+al1);

       // al1.removeAll(al);

        al1.clear();

        System.out.println("al1="+al1);


    }
}
