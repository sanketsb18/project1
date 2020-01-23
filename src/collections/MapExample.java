package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> M1 = new HashMap<>();
        M1.put("Ram", "Lakshman");
        M1.put("Shahu", "Bhosale");
        M1.put("100", "Amit");
        M1.put("123", "Vijay");
        System.out.println("Hash Map example : ");
        System.out.println("\t" + M1);
    }
}
