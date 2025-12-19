package array;

import java.util.Arrays;

public class searching {
    public static void main(String[] args) {
        System.out.println("---------------Working on Numbers----------------");
        int numbers[] = { 0, 2, 16, 4, 6, 8 };
        // sort the array in order to use binarySearch
        Arrays.sort(numbers);
        int indexOf8 = Arrays.binarySearch(numbers, 8);
        System.out.println("The index of 8 is :" + indexOf8);
        int indexOf7 = Arrays.binarySearch(numbers, 7);
        System.out.println("The index of 8 is :" + indexOf7 + "\n");

        System.out.println("---------------Working on String(Animals)----------------");

        // String Array
        String animals[] = { "cat", "dog", "Monkey", "Lion", "Tiger", "Elephant","ant" };
        // Sorting the string array in order to use binary search fucnction
        Arrays.sort(animals);
        System.out.println("Printing the Array after sorting");
        System.out.println(Arrays.toString(animals));
        int indexofDog = Arrays.binarySearch(animals, "dog");
        System.out.println("The Index of Dog is : " + indexofDog);
        int indexofAnt = Arrays.binarySearch(animals, "ant");
        if (indexofAnt < 0) {
            System.out.println("Ant is not present in the Array");
        } else {
            System.out.println("index of Ant is at: " + indexofAnt);
        }

    }
}
