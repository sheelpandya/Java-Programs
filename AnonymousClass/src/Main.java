import example.ConstructorCheck;

interface Age {
    int x = 21;
    void getAge();
}

class AnonymousDemo {

    public static void main(String[] args)
    {

        ConstructorCheck c = new ConstructorCheck();



        Age a1 = new Age() {

            @Override public void getAge()
            {
                System.out.print("Age is " + x);
            }
        };

        a1.getAge();
    }
}
