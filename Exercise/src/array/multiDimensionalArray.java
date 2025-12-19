package array;

import java.util.Arrays;

public class multiDimensionalArray {
    public static void main(String[] args) {
        // 2D Array
        int twoDArray[][] = new int[3][3];
        twoDArray[0][0] = 0;
        twoDArray[0][1] = 1;
        twoDArray[0][2] = 2;
        twoDArray[1][0] = 3;
        twoDArray[1][1] = 4;
        twoDArray[1][2] = 5;
        twoDArray[2][0] = 6;
        twoDArray[2][1] = 7;
        twoDArray[2][2] = 8;

        System.out.println("----------------------2-D Array(1)-------------------------");
        // priting the 2dArray
        System.out.println("twoDimArray: " + Arrays.toString(twoDArray));
        System.out.println(Arrays.toString(twoDArray[0])); // prints element of first 1D Array
        System.out.println(Arrays.toString(twoDArray[1])); // prints element of second 1D Array
        System.out.println(Arrays.toString(twoDArray[2])); // prints element of third 1D Array
        System.out.println();

        System.out.println("----------------------2-D Array(2)-------------------------");
        int ages[][] = { // each curly brackt represents one-D Array
                { 15, 20 }, // first 1-d Array
                { 20, 25, 26 }, // Second 1-d Array
                { 30 } // third 1-d Array
        };
        System.out.println("twoDimArray: " + Arrays.toString(ages));
        System.out.println(Arrays.toString(ages[0])); // prints element of first 1D Array
        System.out.println(Arrays.toString(ages[1])); // prints element of second 1D Array
        System.out.println(Arrays.toString(ages[2])); // prints element of third 1D Array
        System.out.println();

        // 3D Array
        System.out.println("----------------------3-D-------------------------");
        int threeDimArray[][][] = {
                { // First 2-D Array
                        { 1, 2, 3 }, // first 1-D Array
                        { 4, 5 } // second 1-D Array
                },
                { // Second 2-D Array
                        { 6 }, // first 1-D Array
                        { 7, 8, 9, 10 }, // second 1-D Array
                        { 11, 12 } // Third 1-D Array
                },
        };
        System.out.println("threeDimArray: " + Arrays.toString(threeDimArray));
        // printing first 2d Array
        System.out.println("first 1D-array in first 2D-array : " + Arrays.toString(threeDimArray[0][0])); // prints
                                                                                                          // element of
                                                                                                          // first 1D
                                                                                                          // Array
        System.out.println("second 1D-array in first 2D-array : " + Arrays.toString(threeDimArray[0][1])); // prints
                                                                                                           // element of
                                                                                                           // second 1D
                                                                                                           // Array

        System.out.println("first 1D-array in second 2D -array : " + Arrays.toString(threeDimArray[1][0])); // prints
                                                                                                            // element
                                                                                                            // of first
                                                                                                            // 1D Array
        System.out.println("second 1D-array in second 2D-array : " + Arrays.toString(threeDimArray[1][1])); // prints
                                                                                                            // element
                                                                                                            // of second
                                                                                                            // 1D Array
        System.out.println("third 1D-array in second 2D -array: " + Arrays.toString(threeDimArray[1][2])); // prints
                                                                                                           // element of
                                                                                                           // second 1D
                                                                                                           // Array

    }
}
