package practice;

import java.util.HashMap;

public class Exercise3 {
    public static void main(String[] args) {
        //create HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<>();
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }
}
