// Defining a sealed class
sealed class Human permits Manish, Vartika, Anjali
{
    public void printName()
    {
        System.out.println("Default");
    }
}

non-sealed class Manish extends Human
{
    public void printName()
    {
        System.out.println("Manish Sharma");
    }
}

non-sealed class Vartika extends Human
{
    public void printName()
    {
        System.out.println("Vartika Dadheech");
    }
}
class Sp extends Vartika
{
    public void printName()
    {
        System.out.println("Sp");
    }
}


final class Anjali extends Human
{
    public void printName()
    {
        System.out.println("Anjali Sharma");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Human h1 = new Anjali();
        Human h2 = new Vartika();
        Human h3 = new Manish();

        Human h4 = new Sp();

        h1.printName();
        h2.printName();
        h3.printName();
        h4.printName();

        
    }

}
