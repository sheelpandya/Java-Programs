
import java.util.*;

public class StringsDemo
{

    public static void main(String[] args) {
        System.out.println("Hello World");

        Comparator<String> customCom = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        };
        PriorityQueue<String>q = new PriorityQueue<String>(customCom);

        q.add("apple");
        q.add("banana");
        q.add("date");
        q.add("cherry");
        q.add("bacon");

//         q.add("Amit");
// 		q.add("Vijay");
// 		q.add("Karan");
// 		q.add("Jai");
// 		q.add("Rahul");

        Iterator itr = q.iterator();

        while(itr.hasNext()) {
            String s = (String)itr.next();
            System.out.println(s);
        }

    }
}


// import java.util.*;
// class Main {
// 	public static void main(String args[]) {
// 		PriorityQueue<String> queue=new PriorityQueue<String>();
// 		queue.add("Amit");
// 		queue.add("Vijay");
// 		queue.add("Karan");
// 		queue.add("Jai");
// 		queue.add("Rahul");

// 		Iterator itr=queue.iterator();
// 		while(itr.hasNext()) {
// 			System.out.println(itr.next());
// 		}
// 	}
// }