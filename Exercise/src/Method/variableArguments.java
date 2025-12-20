package Method;

import java.util.Scanner;

public class variableArguments {
    public static void main(String[] args) {
        // taking input from the user
        Scanner sc = new Scanner(System.in);
        // now we will pass this string array inside the function
        while (true) {
            System.out.println("Enter the Numbers you wan to sum, leaving the space between them");
            String[] number = sc.nextLine().split(" ");
            sumNumbers(number);
            System.out.print("Do you want to continue (Y for yes, N for No) : ");
            char input = sc.nextLine().charAt(0);
            if (input == 'n' || input == 'N') {
                System.out.println("-------------------Program Terminated-------------------");
                break;
            }
        }
        sc.close();
    }

    public static void sumNumbers(String... numbers) {
        int sum = 0;
        String enteredNumbers = ""; // this is just for showing the output

        for (int i = 0; i < numbers.length; i++) {
            // we will pick the elements from the numbers array which is of string type
            // then we will parse it into the array
            sum += Integer.parseInt(numbers[i]);
            // now we will feed this number inside the print so that user could see it
            if (i != numbers.length - 1) {
                enteredNumbers += numbers[i] + " + ";
            } else {
                enteredNumbers += numbers[i] + " ";
            }
        }
        System.out.println(enteredNumbers + "= " + sum);
    }
}
