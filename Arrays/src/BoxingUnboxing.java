/*
Here is the code for representing the concept of boxing and unboxing in java by using wrapper class and primitive data types
 */

import java.util.ArrayList;
import java.util.List;

public class BoxingUnboxing{

    public static void main(String[] args) {

        int primitiveInt = 100;

        Integer boxedInt = primitiveInt;

        int unboxedInt = boxedInt;


        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(200);
        arrayList.add(300);
        int firstElement = arrayList.get(0);

        System.out.println(firstElement);


    }
}