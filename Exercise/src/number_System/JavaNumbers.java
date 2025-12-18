package number_System;


public class JavaNumbers {

	public static void main(String[] args) {
		System.out.println("---------------------------- Binary Numbers ------------------------------");
		int binaryNum1 = 0b1001;	// 9 in decimal
		int binaryNum2 = 0b1011; // 11 in decimal
		int sumBinary  = AdditionNum(binaryNum1, binaryNum2);
		
		System.out.println("binaryNum1 is :" + binaryNum1);
		System.out.println("binaryNum2 is :" + binaryNum2);
		System.out.println("The result of Summation in Decimal is :" + sumBinary);
		System.out.println("The result of Summation in Binary is : " + Integer.toBinaryString(sumBinary));
		
		System.out.println("---------------------------- octal Numbers ------------------------------");
		int octalNum1 = 015; // This will be stored as 13 in decimal
		int octalNum2 = 0106; // this will be stored as 70 in decimal
		int sumOctal = AdditionNum(octalNum1, octalNum2);
		
		System.out.println("octalNum1 is : " + octalNum1);
		System.out.println("octalNum2 is : " + octalNum2);
		System.out.println("The result of Summation in decimal is : " + sumOctal);
		System.out.println("The result of Summation in octal is : " + Integer.toOctalString(sumOctal) + "\n");
	
		System.out.println("---------------------------- HexaDecimal Numbers ------------------------------");
		int hexNum1 = 0x1B0; // 432 in decimal
		int hexNum2 = 0x2F3; // 755 in decimal
		int sumHexaDecimal = AdditionNum(hexNum1, hexNum2);
		
		System.out.println("hexNum1 is : " + hexNum1);
		System.out.println("hexNum2 is : " + hexNum2);
		System.out.println("The result of Summation in decimal is : " + sumHexaDecimal);
		System.out.println("The result of Summation in hexaDecimal is : " + Integer.toHexString(sumHexaDecimal) + "\n");


	}
	
	public static int AdditionNum(int x,int y) {
		return x+y;
	}

}
