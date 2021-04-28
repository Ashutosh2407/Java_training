package task1;

public class Swap {

	public static void main(String[] args) {
		 System.out.println("USING TEMP VARIABLE");
			int a = 5;
			int b = 7;
			int result;
			System.out.printf("The value of a and b is %d and %d respectively.\n", a,b);
			result = a;
			a = b;
			b = result;
			System.out.printf("The value of a and b is %d and %d respectively.\n", a,b);
			
			System.out.println("WITHOUT USING TEMP VARIABLE");
			int x = 5;
			int y = 10;
			System.out.printf("The value of x and y is %d and %d respectively.\n", x,y);
			x = x + y;
			y = x - y;
			x = x - y;
			System.out.printf("The value of x and y is %d and %d respectively.\n", x,y);
	}

}
