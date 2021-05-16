package task7;

import java.util.HashMap;
import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		System.out.println("Please enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i = 0; i < str.length();i++) {
			if(hm.get(str.charAt(i)) == null) {
				hm.put(str.charAt(i), 1);
			}
			else {
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
		}
		hm.forEach((k,v) -> System.out.println(k + " : " +v));

	}

}
