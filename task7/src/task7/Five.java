package task7;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("Please enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");
		System.out.println("The number of words in the string are "+(words.length));
		

	}

}
