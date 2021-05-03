package task3;
import java.util.Scanner;


public class One {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i = 1; i<=10;i++) {
			System.out.printf(input + " X "+ i +" = "+(input*i));
			System.out.println();
		}

	}

}
