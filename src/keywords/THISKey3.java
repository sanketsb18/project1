package keywords;

/* this keyword : to invoke current class constructor */
/* calling default constructor from parameterized constructor */


class B {
    B() {
        System.out.println("hello B");
    }
    B (int x) {
        this();
        System.out.println(x);
    }
}
public class THISKey3 {
    public static void main(String[] args) {
        B b = new B(25);

    }
}
