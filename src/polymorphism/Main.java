package polymorphism;

abstract class Animal {
    public abstract void makeSound();
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark bark..");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow meow..");
    }
}
class Main {
    public static void main(String[] args) {
        Dog  d1 = new Dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
    }
}
