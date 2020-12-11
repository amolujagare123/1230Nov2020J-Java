package CollectionDemos.MapDemos;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(102, "amol");
        lhm.put(302, "sopan");
        lhm.put(502, "amit");
        lhm.put(103, "praful");
        lhm.put(602, "ganesh");
        lhm.put(352, "rahul");

        System.out.println("hm=" + lhm);
        
    }
}
