/*
Below is the code for the usage of linkedlist and iterator used
*/



import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("from");
        linkedList.add("java");

        System.out.println(linkedList);


        linkedList.push("using push method");

        System.out.println(linkedList);

        linkedList.offer("using offer method");

        System.out.println(linkedList);

        linkedList.offerFirst("using offerFirst method");


        String firstElement = linkedList.get(0);
        String secondElement = linkedList.get(1);


        linkedList.remove(2);

        System.out.println(linkedList);

        boolean containsWord = linkedList.contains("java");


        int size = linkedList.size();


//        linkedList.clear();

        System.out.println(linkedList);

        boolean isEmpty = linkedList.isEmpty();

        System.out.println(isEmpty);

        System.out.println("Using Iterator");
        Iterator<String> itr= linkedList.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }
    }
}
