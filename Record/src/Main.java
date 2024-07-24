    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    record vehicle(String name,int wheels ,String colour){
        vehicle(String name,int wheels, String colour){
            this.name=name;
            this.wheels = wheels;
            this.colour = colour;

        }
    }

    public class Main {
        public static void main(String[] args) {
            vehicle r1 = new vehicle("Merc",4,"Black");

            System.out.println(r1.name());
        }
    }