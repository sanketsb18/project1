package keywords;

/* final keyword  */
class Car {
    final int speedlimit = 120;
    void run (){
        //speedlimit = 400;
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
    Car obj = new Car();
    obj.run();
    }
}
