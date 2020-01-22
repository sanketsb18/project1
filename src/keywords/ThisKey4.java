package keywords;

/* this keyword : to invoke current class constructor */
/* calling parameterized constructor from default constructor */

class C {
    C(){
        this(35);
        System.out.println("hello c");
    }
    C(int x){
        System.out.println(x);
    }
}
public class ThisKey4 {
    public static void main(String[] args) {
        C c = new C();
    }
}
