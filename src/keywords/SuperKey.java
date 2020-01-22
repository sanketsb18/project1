package keywords;


class parent {
        String color = "white";
}
class child extends parent {
    String color = "black";
    void printColor () {
        System.out.println(color);          //prints color of child class
        System.out.println(super.color);    //prints color of parent class
    }
}
public class SuperKey {
    public static void main(String[] args) {
        child d = new child();
        d.printColor();
    }
}
