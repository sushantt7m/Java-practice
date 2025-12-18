package operator;

public class conditionalOperator {

	public static void main(String[] args) {
		// && conditional AND operator
		// || conditional OR operator
		// ?: Ternary operator
		
		int num1 = 5, num2 = 8, num3 = 12;
		boolean result;
		
		// conditional AND operator (&&)
		result = (num1 > num2) && (num2 < num3); // both needs to be true in order for the result to be true
		System.out.println("Result(&&) = " + result);
		
		// conditional OR Operator (||)
		result = (num1 < num2) || (num2 > num3); // anyone needs to be true in order for the result to be true
		System.out.println("Result(||)  = " + result);
		
		//Ternary Operator (?)
		result  = num1>num2 ? true : false;
		System.out.println("Result = " + result);
		
	}

}
