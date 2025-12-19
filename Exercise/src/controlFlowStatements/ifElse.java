package controlFlowStatements;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int number = inputScanner.nextInt();
        if(number%2==0){
            System.out.println("Number is 'Even'");
        }
        else{
            System.out.println("Number is 'odd'");
        }
        inputScanner.close();
    }
}
