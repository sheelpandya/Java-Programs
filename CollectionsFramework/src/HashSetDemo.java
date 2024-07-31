import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>(5,0.67f);

        System.out.println(hs.size());
        hs.add("Sheel");
        hs.add("Sheel");
        hs.add("Virat");
        hs.add("Sachin");
        hs.add("ABD");
        hs.add("Rohit");
        hs.add("Boom");

        System.out.println(hs);

        System.out.println(hs.size());


        HashSet<Integer> hi = new HashSet<>();
        hi.add(10);
        hi.add(100);
        hi.add(20);
        hi.add(30);
        hi.add(10);
        hi.add(40);


        System.out.println(hi);
    }
}
