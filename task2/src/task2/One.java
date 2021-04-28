package task2;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		System.out.println("PLease enter a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input %3 == 0 && input %5 == 0) {
			System.out.println("ConsultAdd Java Training");
		}
		else if(input % 5 == 0) {
			System.out.println("JAVA Training");
		}
		else if (input % 3 == 0) {
			System.out.println("Consultadd");
		}	

	}

}
