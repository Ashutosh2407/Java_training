package task7;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		System.out.println("Please enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev = "";
		for(int i = str.length()-1; i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("The reversed string is "+rev);

	}

}
