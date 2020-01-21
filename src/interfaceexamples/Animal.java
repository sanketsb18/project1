package interfaceexamples;

/* interface */
interface Animal {
     void animalSound();      //interface method (does not have a body)
     void sleep ();           //interface method (does not have a body)
}

/* Pig implements the Animal interface */
class Pig implements Animal {
    @Override
    public void animalSound() {
        System.out.println("The Pig says wee wee.");    //the body of animal sound
    }

    @Override
    public void sleep() {                       //the body of sleep sound
        System.out.println("Zzz...");
    }
}
class MyMainClass {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }

        }
