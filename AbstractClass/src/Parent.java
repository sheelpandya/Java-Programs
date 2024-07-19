abstract class Parent{
    abstract void printNum(String s);

    void printWhole(String first){
        System.out.println("Header");
        printNum(first);
        System.out.println("Footer");
    }
}