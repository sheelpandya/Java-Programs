
enum Animal {
    CAT {
        public String makeNoise() { return "MEOW!"; }
    },
    DOG {
        public String makeNoise() { return "WOOF!"; }
    };

    public abstract String makeNoise();
}



public class StaticMethodCall
{
    public static void main(String[] args) {

        String s = Animal.CAT.makeNoise();
        System.out.println(s);
    }
}