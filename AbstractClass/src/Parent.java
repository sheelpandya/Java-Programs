abstract class Parent{
    abstract void printNum();

    void printWhole(){
        System.out.println("Header");
        printNum();
        System.out.println("Footer");
    }
}