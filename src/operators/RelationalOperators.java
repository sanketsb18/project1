package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        int number1 = 5, number2 = 6;
        if (number1 > number2)
        {
            System.out.println("number1 is greater than number2.");
        }
        else
        {
            System.out.println("number2 is greater than number1.");
        }

        String test = "asdf";
        boolean result;

        result = test instanceof String;
        System.out.println(result);
    }
}
