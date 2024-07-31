import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();

        tm.put("Monday",1);
        tm.put("Tuesday",2);
        tm.put("Wednesday",3);
        tm.put("Thursday",4);
        tm.put("Friday",5);
        tm.put("Saturday",6);

        System.out.println(tm);
        System.out.println(tm.ceilingKey("Nesday"));
        System.out.println(tm.floorKey("Nesday"));
    }
}
