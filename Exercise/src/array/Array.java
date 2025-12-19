package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
//		int[] numberArray = new int[5]; //it can hold 5 element
		
		int[] numberArray;
		numberArray = new int[5];
		
		numberArray[0]=5;
		numberArray[1]=6;
		System.out.println(Arrays.toString(numberArray));
		
		Object[] mixedArraysObjects = {3,5.5,"Cat",false,20};
		System.out.println(Arrays.toString(mixedArraysObjects));
 		
	}

}
