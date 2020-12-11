package CollectionDemos.MapDemos;


import java.util.HashMap;

public class HashMapDemo4 {

    public static void main(String[] args) {


        HashMap<Integer,String> hm = new HashMap<>();


        hm.put(102,"amol");
        hm.put(302,"sopan");
        hm.put(502,"amit");
        hm.put(103,"praful");
        hm.put(602,"ganesh");
        hm.put(352,"rahul");


        System.out.println("hm="+hm);

        System.out.println("size="+hm.size());


        hm.clear();
        System.out.println("hm="+hm);

    }
}
