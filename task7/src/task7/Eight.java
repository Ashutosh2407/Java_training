package task7;

import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		System.out.println("Please enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printPermute(str,"");

	}
	
	
	public static void printPermute(String str,String ans) {
		if(str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		
		for(int i=0; i < str.length();i++) {
			char ch = str.charAt(i);
			
			String ros = str.substring(0,i) + str.substring(i+1);
			
			printPermute(ros, ans + ch);
		}
	}

}
