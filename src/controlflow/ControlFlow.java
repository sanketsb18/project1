package controlflow;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class ControlFlow {
    public static void main(String[] args) {
        /*int number;
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number > 0){
            System.out.println("Number is positive and greater than 0.");
        }
        else {
            System.out.println("This number is negative and less than 0.");
        }*/

        /*if(number > 0){
            System.out.println("Number is positive and greater than 0.");
        }
            System.out.println("This statement is always executed.");*/

       /* if (number > 0) {
            System.out.println("Number is positive.");
        }
        else if (number < 0) {
            System.out.println("Number is negative.");
        }
        else {
            System.out.println("Number is 0.");*/

            Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;
            if (n1 >= n2) {
                if (n1 >= n3) {
                    largestNumber = n1;
                } else {
                    largestNumber = n3;
                }
            } else {
                if (n2 >= n3) {
                    largestNumber = n2;
                } else {
                    largestNumber = n3;
                }
            }
            System.out.println("Largest number is " + largestNumber);
    }
}
