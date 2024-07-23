import java.util.Arrays;
import java.util.Random;
public class ArrayMethods1 {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray );
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = {10, 20, 30, 40, 50,60,70};
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = new int[5];
        fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("4th " + Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));
    }
}
