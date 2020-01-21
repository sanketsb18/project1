package methodoverriding;

class Company {
    public void address () {
        System.out.println("This the address of company.");
    }
}

class eBay extends  Company {
    @Override
    public void address () {
        System.out.println("This the address of eBay.");
    }
}

public class ObjectOverriding {
    public static void main(String[] args) {
        Company a = new Company();
        Company b = new eBay();
        a.address();
        b.address();
    }
}
