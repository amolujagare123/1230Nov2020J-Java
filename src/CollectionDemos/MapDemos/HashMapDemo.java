package CollectionDemos.MapDemos;


import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {


        HashMap hm = new HashMap();

        hm.put(102,"amol");
        hm.put(302,"sopan");
        hm.put(502,"amit");
        hm.put(103,"praful");
        hm.put(602,"ganesh");
        hm.put(352,"rahul");

        System.out.println(hm);

        hm.put(602,"new name");

        System.out.println(hm);


        hm.put('g',34);
        hm.put(1.2,true);

        System.out.println(hm);

        hm.put(603,null);
        hm.put(604,null);
        hm.put(605,null);
        System.out.println(hm);

        hm.put(null,"first null");

        System.out.println(hm);

        hm.put(null,"two null");

        System.out.println(hm);




    }
}
