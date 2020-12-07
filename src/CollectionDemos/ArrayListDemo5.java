package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("praful");
        al.add("amit");
        al.add("sopan");
        al.add("santosh");
        al.add("rahul");



        System.out.println("al="+al);

    // remove all the elemnts which starts with 'am'

       // al.removeIf(str -> str.startsWith("am"));

    // remove all the elements which ends with 'l'

        al.removeIf(str -> str.endsWith("l"));

        System.out.println("al="+al);
    }
}
