import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(50);
        ts.add(40);
        ts.add(60);
        ts.add(6000);

        System.out.println(ts);

        Iterator descItr = ts.descendingIterator();

        System.out.println("Here is data in descending order");
        while(descItr.hasNext()){
            Integer a = (Integer)descItr.next();
            System.out.println(a + "Hashcode -> " + a.hashCode());
        }

        System.out.println("Hello".hashCode());
    }
}
