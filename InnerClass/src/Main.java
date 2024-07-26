class Outer {
    static int outer_x = 100;
    void test() {
// 		Inner inner = new Inner();
        Inner.display();
    }

    static class Inner {
        static void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
class Main {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}


//Creating object of inner class

// class Outer {
// 	int outer_x = 100;
// 	void test() {
// 		Inner inner = new Inner();
// 		inner.display();
// 	}    class Inner {
// 		void display() {
// 			System.out.println("display: outer_x = " + outer_x);
// 		}
// 	}
// } class Main {
// 	public static void main(String args[]) {
// 		Outer outer = new Outer();
// 		Outer.Inner i = outer.new Inner();
// 		outer.test();
// 	}
// }