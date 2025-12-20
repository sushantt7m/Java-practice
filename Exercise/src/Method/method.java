package Method;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        // calling function
        int minimum = min(num1, num2);
        int maximum = max(num1, num2);
        int addition = add(num1, num2);
        show(num1, num2);
        System.out.println("The minimum is " + minimum + " and maximum is " + maximum);
        System.out.println("The summation is : " + addition);

        sc.close();
    }

    // shows the parameter
    public static void show(int num1, int num2) {
        System.out.println("You entered " + num1 + " and " + num2);
    }

    // returns the sum of two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int min(int num1, int num2) {
        if (num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

}
