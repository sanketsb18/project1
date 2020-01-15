package methodoverriding;

public class ABC {
    //overidden method
    public void disp(){
        System.out.println("disp() method of parent class");
    }
}

class Demo extends ABC {
    //overiding method
    public void disp() {
        System.out.println("disp() method of child class");
    }
    public void newMethod(){
        System.out.println("new method of child class");
    }

    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.disp();
        ABC obj2 = new Demo();
        obj2.disp();
    }
}
