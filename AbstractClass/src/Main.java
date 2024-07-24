import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the number you want to print (Enter 0 to exit : ");
            num = sc.nextInt();

            switch (num) {
                case 1: {
                    Parent c = new Child1();
                    c.printWhole();
                    break;
                }
                case 2: {
                    Parent c = new Child2();
                    c.printWhole();
                    break;
                }
                case 3: {
                    Parent c = new Child3();
                    c.printWhole();
                    break;
                }
                case 4: {
                    Parent c = new Child4();
                    c.printWhole();
                    break;
                }
                default: {
                    System.out.println("Invalid Number");
                    break;
                }
            }
        } while (num != 0);
    }
}