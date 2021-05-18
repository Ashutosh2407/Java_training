package task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String inp = "Never give up";
		List<String> words = new ArrayList<String>();
		String[] separate  = inp.split(" ");
		for(String word: separate) {
			words.add(word);
		}
		System.out.println("Different words "+ words.stream().count());
	}

}


