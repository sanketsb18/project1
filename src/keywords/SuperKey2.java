package keywords;

/* super keyword : to invoke parent class constructor */
class Vehicle {
    Vehicle () {
        System.out.println("Vehicle is created...");
    }
}
class bike extends Vehicle {
    bike () {
        super();
        System.out.println("Bike is created...");
    }
}
public class SuperKey2 {
    public static void main(String[] args) {
        bike yamaha = new bike();
    }
}
