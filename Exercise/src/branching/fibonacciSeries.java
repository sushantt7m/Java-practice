package branching;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Max Sequence Number: ");
        int n = sc.nextInt();
        int fibPrev = 0;
        int fibonacci = 1;
        int sum = 0;

        for(int i=1;i<=n;i++){
            System.out.print(fibPrev + " ");
            sum = fibPrev+fibonacci;
            fibPrev = fibonacci;
            fibonacci =sum;
        }
        sc.close();
    }
}
