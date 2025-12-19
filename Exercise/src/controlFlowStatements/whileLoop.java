package controlFlowStatements;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.print(" " + x);
            x++;
        }
        System.out.println();

        String animals[] = { "Cat", "Dog", "Horse", "Cow" };
        int i = 0;
        while (i < animals.length) {
            System.out.println("animals [" + i + "] =" + animals[i]);
            i++;
        }
        System.out.println();

        // factorial of n=5
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the number you want Factorial of: ");
        int n = sc.nextInt();
        int temp = n;
        long result = 1;
        if (n < 0) {
            System.out.println(n + "! is not defined");
        } else if (n == 0 || n == 1) {
            System.out.println(n + "! = 1");
        } else {
            while (n > 0) {
                result *= n;
                n--;
            }
            System.out.println("factorial of " + temp + " is: " + result);
        }
        sc.close();
    }
}
