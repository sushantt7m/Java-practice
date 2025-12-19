package controlFlowStatements;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        // switch(expression){
        //     case value1:
        //         //code to be executed
        //         break; //optional
        //     case value2:
        //         //code to be executed
        //         break; //optional
        //     case value3:
        //         //code to be executed
        //         break; //optional
        //     default:
        //         // code to be executed if all cases are false
        // }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a day number of a week: ");
        int dayNumber = scanner.nextInt();

        String dayStr = null;

        switch(dayNumber){
            case 1:
                dayStr = "Monday";
                break;
            case 2:
                dayStr = "Tuesday";
                break;
            case 3:
                dayStr = "Wednesday";
                break;
            case 4:
                dayStr = "Thursday";
                break;
            case 5:
                dayStr = "Friday";
                break;
            case 6:
                dayStr = "Saturday";
                break;
            case 7:
                dayStr = "Sunday";
                break;
            default:
                System.out.println("Invalid day choice");
                break;
        }
        System.out.println(dayStr);
        scanner.close();
    }
}
