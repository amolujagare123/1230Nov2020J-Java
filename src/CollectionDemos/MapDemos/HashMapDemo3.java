package CollectionDemos.MapDemos;


import java.util.HashMap;

public class HashMapDemo3 {

    public static void main(String[] args) {


        HashMap<Integer,String> hm = new HashMap<>();

        System.out.println(hm.isEmpty()); // true

        hm.put(102,"amol");
        hm.put(302,"sopan");
        hm.put(502,"amit");
        hm.put(103,"praful");
        hm.put(602,"ganesh");
        hm.put(352,"rahul");

        System.out.println(hm.isEmpty()); // false

        System.out.println("hm="+hm);

        System.out.println(hm.get(502));

        hm.remove(502);

        System.out.println("hm="+hm);


        System.out.println(hm.containsKey(601));

        System.out.println(hm.containsValue("rahul1"));




    }
}
