package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(34);
        al.add(45);
        al.add(55);
        al.add(39);


        System.out.println("al="+al);


// remove all the elemnts which are less than 40

        al.removeIf(a -> a<40);

        System.out.println("al="+al);
    }
}
