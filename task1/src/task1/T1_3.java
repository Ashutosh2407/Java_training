package task1;

import java.util.Scanner;

public class T1_3 {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers between 1 - 10");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int z = a+b;
		int result= z+30;
		System.out.printf("The final result is %d",result);
	}

}
