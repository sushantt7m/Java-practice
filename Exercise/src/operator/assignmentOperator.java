package operator;

public class assignmentOperator {

	public static void main(String[] args) {
		int x = 20, y = 15, z = 0;
		
		z=x+y;
		System.out.println("z=x+y = "+z);
		
		// z+=x;  means z= z+x
		z+=x;
		System.out.println("z+=x = "+z);
		
		z-=x;
		System.out.println("z-=x = "+z);
		
		z*=x;
		System.out.println("z*=x = "+z);
		
		z/=x;
		System.out.println("z/=x = "+z);
	}

}
