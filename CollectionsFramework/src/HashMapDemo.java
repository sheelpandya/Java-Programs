import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Sheel");
        hm.put(2, "Abcd");
        hm.put(3, "Bcdf");
        hm.put(4, "Pandya");

        Set<Map.Entry<Integer, String>> s = hm.entrySet();

        Iterator itr = s.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> m = (Map.Entry)itr.next();
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
        System.out.println(hm);

    }
}
