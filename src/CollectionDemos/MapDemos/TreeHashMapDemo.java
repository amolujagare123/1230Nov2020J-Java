package CollectionDemos.MapDemos;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeHashMapDemo {

    public static void main(String[] args) {

        TreeMap tm = new TreeMap();

        tm.put(102, "amol");
        tm.put(302, "sopan");
        tm.put(502, "amit");
        tm.put(103, "praful");
        tm.put(602, "ganesh");
        tm.put(352, "rahul");
       // tm.put("key", 'n');

        System.out.println("hm=" + tm);
        
    }
}
