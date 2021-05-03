package task3;
import java.util.Scanner;


public class Six {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter three numbers");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a <b && b< c) {
				System.out.println("INCREASING");
			}
			else if(a >b && b> c) {
				System.out.println("DECREASING");
			}
			else {
				System.out.println("NEITHER INCREASING OR DECREASING");
			}
			

		}

	

}
