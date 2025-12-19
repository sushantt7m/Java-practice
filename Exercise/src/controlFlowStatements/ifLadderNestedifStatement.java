package controlFlowStatements;

import java.util.Scanner;

public class ifLadderNestedifStatement {
    public static void main(String[] args) {
        // Scanner age = new Scanner(System.in);
        // System.out.println("Enter the Age : ");

        // int yourAge = age.nextInt();

        // if(yourAge < 13){
        // System.out.println("You are a child");
        // }
        // else if(yourAge<19){
        // System.out.println("You are a teenager");
        // }
        // else{
        // if(yourAge<65){
        // System.out.println("you are an Adult");
        // }else{
        // System.out.println("You are a Senior");
        // }
        // }
        // age.close();

        Scanner numberInput = new Scanner(System.in);
        System.out.print("Please Enter 3 Numbers :");
        int number1 = numberInput.nextInt();
        int number2 = numberInput.nextInt();
        int number3 = numberInput.nextInt();

        int largestNumber;
        if (number1 > number2) {
            if (number1 >= number3) {
                largestNumber = number1;
            } else {
                largestNumber = number3;
            }
        } else {
            if (number2 >= number3) {
                largestNumber = number2;
            } else {
                largestNumber = number3;
            }
        }

        System.out.println("The largest Among " + number1 + ", " + number2 + ", " + number3 + " is : " + largestNumber);
        numberInput.close();
    }

}
