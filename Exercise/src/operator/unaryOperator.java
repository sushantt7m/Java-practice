package operator;

public class unaryOperator {

	public static void main(String[] args) {
		double number = 7.6;
		boolean isCheck = true;
		
		System.out.println("+number = " + +number );
		System.out.println("-number  = " + -number );
		System.out.println("++number = " + ++number );
		System.out.println("--number = " + --number );
		System.out.println("!number = " + !isCheck );
		
		
		System.out.println("--------------------------------------------");
		double result = 7.6;
		System.out.println("result++ = "  + result++);
		System.out.println("result = " + result);
		System.out.println("++result = "+ ++result);
		System.out.println("result = " + result);
	}

}
