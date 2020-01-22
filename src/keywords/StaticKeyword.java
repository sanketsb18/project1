package keywords;

/* static keyword  */

class Employee {
    int empNumber;
    String empName;
    static String company = "Apple";
    Employee (int n, String x) {
    empNumber = n;
    empName = x;
    }
    void display() {
        System.out.println(empNumber +" "+ empName+ " "+ company);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
    Employee emp1 = new Employee(1123, "John");
    Employee emp2 = new Employee(1125, "Martin");

    emp1.display();
    emp2.display();

    }
}
