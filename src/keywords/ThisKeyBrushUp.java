package keywords;

public class ThisKeyBrushUp {

    String name;
    int age;
    String address;

    ThisKeyBrushUp(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public ThisKeyBrushUp() {
        this("Sanket",26,"Pune");

    }

    void getData(){
        this.showData();
    }

    void showData(){

        System.out.println(
                "name : "+name+"\n"+
                        "age : "+age+"\n"+
                        "address : "+address+"\n"
        );

    }

    public static void main(String[] args) {
        ThisKeyBrushUp brushup=new ThisKeyBrushUp();
        brushup.showData();
    }

}
