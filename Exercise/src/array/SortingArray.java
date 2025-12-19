package array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {

		System.out.println("-------------------------Sorting Double Array--------------------------------");
		double[] array1 = { 2.3, 11.0, 4.6, -3.6, 0.8, 12 };
		System.out.println("unSortedArray: " + Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("SortedArray :" + Arrays.toString(array1) + "\n");

		// Sorting int Array
		System.out.println("-----------------------------Sorting Intger Array----------------------------");
		int[] array2 = { 2, 6, 1, 3, 9, 0 };
		System.out.println("unsortedArray: " + Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("sortedArray: " + Arrays.toString(array2) + "\n");

		// sorting character Array
		System.out.println("-------------------Sorting Character Array-------------------------");
		char[] array3 = { 'b', 'h', 'F', 'A', 'a' };
		System.out.println("unSortedArray: " + Arrays.toString(array3));
		Arrays.sort(array3);
		System.out.println("sortedArray: " + Arrays.toString(array3) + "\n");

		// sorting String Array
		System.out.println("-------------------Sorting String Array-------------------------");
		String[] array4 = { "cat","Dog","monkey","Lion","elephant","cow" };
		System.out.println("unSortedArray: " + Arrays.toString(array4));
		Arrays.sort(array4);
		System.out.println("sortedArray: " + Arrays.toString(array4) + "\n");

		// sorting Number String Array
		System.out.println("-------------------Sorting Number String Array-------------------------");
		String[] array5 = { "3","300","20","35","37","31","4","70","ant","Zebra" };
		System.out.println("unSortedArray: " + Arrays.toString(array5));
		Arrays.sort(array5);
		System.out.println("sortedArray: " + Arrays.toString(array5) + "\n");
	}

}
