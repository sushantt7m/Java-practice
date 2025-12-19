package controlFlowStatements;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // printing numbers from 1 to n
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum upto " + n + " is :" + sum);
        sc.close();
    }
}
