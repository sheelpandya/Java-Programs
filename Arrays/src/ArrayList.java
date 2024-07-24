import java.util.*;
 class ArrayListDemo
{
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        List<Integer> arr1 = new ArrayList<>();

        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);


        System.out.println(arr1);

        arr1.set(0,200);
        System.out.println(arr1);
    }
}