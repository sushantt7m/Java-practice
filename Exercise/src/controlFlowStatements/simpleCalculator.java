package controlFlowStatements;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter 2 Numbers: ");
        int number1 = numberInput.nextInt();
        int number2 = numberInput.nextInt();
        int result = 0;

        
        System.out.println("Please Select a Choice from the option below:");
        System.out.println("1: Addition\n2: Subtraction\n3: Division\n4: Multiplication");

        int number = numberInput.nextInt();
        switch (number) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }

        System.out.println("The Result is:" + result);
        numberInput.close();
    }

}
