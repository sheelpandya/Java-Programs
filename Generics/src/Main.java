
class GenericDemo<T> {
    T variable_name;

    GenericDemo(T variable_name) {
        this.variable_name = variable_name;
    }

    void printVariable() {
        System.out.println("Here is the variable -> " + variable_name + "  variable type is -> " + variable_name.getClass().getName());
    }
}

 class Main {
    public static void main(String[] args) {
        GenericDemo<Integer> gd = new GenericDemo<>(100);
        gd.printVariable();

        GenericDemo<String> gdString = new GenericDemo<>("Hello from string");
        gdString.printVariable();
    }
}