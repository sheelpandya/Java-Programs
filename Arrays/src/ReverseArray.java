import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        int[] result = readIntegers();
        System.out.println(Arrays.toString(result));

        int[] reversedCopy = reverseCopy(result);

        System.out.println("reversedCopy " + Arrays.toString(reversedCopy));
    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers, separated by commas ");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int[] reverseCopy(int[] array) {

        int[] reversed = new int[array.length];
        int maxi = array.length - 1;
        for (int el : array) {
            reversed[maxi--] = el;
        }

        return reversed;
    }
}