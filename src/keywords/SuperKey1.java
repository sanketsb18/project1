package keywords;

/* super keyword : to invoke parent class method */
class Animal {
    void eat(){
        System.out.println("Animal Eating..");
    }
}
class Dog extends Animal {
    void eat() {
        System.out.println("Dog eating bread...");
    }
    void bark (){
        System.out.println("Dog Barking...");
    }

    void work () {
        super.eat();
        bark();
    }
}
public class SuperKey1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();

    }
}
