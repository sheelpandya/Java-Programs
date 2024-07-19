import java.util.*;

public class Main {
    public static void main(String[] args) {
        int num=0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter the number you want to print (Enter 0 to exit : ");
            num = sc.nextInt();

            switch(num){
                case 1:{
                    Child c = new Child();
                    c.printWhole("First");
                    break;
                }case 2:{
                    Child c = new Child();
                    c.printWhole("Second");
                    break;
                }case 3:{
                    Child c = new Child();
                    c.printWhole("Third");
                    break;
                }case 4:{
                    Child c = new Child();
                    c.printWhole("Fourth");
                    break;
                }default:{
                    System.out.println("Invalid Number");
                    break;
                }
            }
        }while(num!=0);
    }
}