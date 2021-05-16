package task7;

import java.util.Scanner;

public class Two {
	
	static final int no_of_char = 256;
	static char[] count = new char[no_of_char];
	
	static void getcharcount(String expr) {
		for(int i=0; i < expr.length();i++) {
			count[expr.charAt(i)]++;
		}
	}
	
	static int firstnonrep(String expr) {
		getcharcount(expr);
		for(int i=0; i < expr.length();i++) {
			if (count[expr.charAt(i)] == 1) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Please enter a string");
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		int i = firstnonrep(inp);
		System.out.println("The first non repeating char is "+inp.charAt(i));

	}

}
