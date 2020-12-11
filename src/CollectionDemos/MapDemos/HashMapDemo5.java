package CollectionDemos.MapDemos;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo5 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(102, "amol");
        hm.put(302, "sopan");
        hm.put(502, "amit");
        hm.put(103, "praful");
        hm.put(602, "ganesh");
        hm.put(352, "rahul");

        System.out.println("hm=" + hm);

        Set s =  hm.keySet();
        System.out.println("set s="+s);

        Collection c = hm.values();

        System.out.println("Values="+c);

        Set entrySet = hm.entrySet();
        System.out.println("set entrySet="+entrySet);





    }
}
