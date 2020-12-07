package CollectionDemos;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<Character> al = new ArrayList<>();

        al.add('a');//
        al.add('b');
        al.add('c');
        al.add('e');//
        al.add('f');
        al.add('g');
        al.add('h');
        al.add('i');//
        al.add('j');

        System.out.println("al="+al);

    // remove all the vowels - a ,e, i , o ,u
   //al.removeIf(ch -> (ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u')  );

   //  remove all the  consonants
       // al.removeIf(ch -> !(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u')  );
        al.removeIf(ch -> (ch!='a' && ch !='e' && ch!='i' && ch!='o' && ch!='u')  );

        System.out.println("al="+al);
    }
}
