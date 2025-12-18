package comments;

public class JavaComments {

	public static void main(String[] args) {
//		Printing hello world
		System.out.println("Hello Java Developers");

		System.out.println("The name is Sushant kumar");
		System.out.println("The name is Sushant kumar");
		System.out.println("The name is Sushant kumar");
		System.out.println("The name is Sushant kumar");
		System.out.println("The name is Sushant kumar");
		
		int num =  multiplicationOfNum(10, 15);
		System.out.printf("The multiplication of the number is : %d\n",num);
	}
	
	/**
	 * Multiplication of two numbers
	 * @param x	is the first parameter
	 * @param y is the second parameter
	 * @return this returns the multiplication of x and y
	 */
	public static int multiplicationOfNum(int x,int y) {
		return x*y;
	}

}
