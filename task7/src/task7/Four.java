package task7;

import java.util.Scanner;

public class Four {
	
	public static boolean unique(String str) {
		for(int i =0; i < str.length();i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the string");
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		boolean val = unique(inp);
		System.out.println(val);
	}

}
