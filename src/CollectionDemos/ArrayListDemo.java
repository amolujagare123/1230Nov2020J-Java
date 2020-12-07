package CollectionDemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();;

        al.add(34);
        al.add(45);
        al.add(55);
        al.add(4.5);
        al.add('c');
        al.add("amol");
        al.add("rahul");

        System.out.println("al="+al);

        /*System.out.println("-------------using for loop------------");

        for (int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");

        }

        System.out.println("\n-------------using Iterator interface------------");

        Iterator itr = al.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
*/

        ArrayList al2 = new ArrayList();
        System.out.println("al2="+al2);

           al2.addAll(al);

        System.out.println("al2="+al2);


    }
}
