package keywords;

/* static keyword : static keyword with method */
class Student1 {
    int rollno;
    String name;
    static String college = "PVG";
    static void change() {
        college = "MIT";
    }

    // constructor to initialize the variable
    Student1(int r, String n){
        rollno=r;
        name=n;
    }

    //method to display values
void display(){
    System.out.println(rollno +" "+ name + " " +college);
}

}
public class StaticKeyword1 {
    public static void main(String[] args) {
        Student1.change();      //calling change method
        Student1 s1 = new Student1(11, "Rohan");
        Student1 s2 = new Student1(13,"Rahul");
        //calling display method
        s1.display();
        s2.display();
    }
}
