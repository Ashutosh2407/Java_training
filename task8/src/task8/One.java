package task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class One {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=in.next();
		List<Character> separate = new ArrayList<Character>();
		for(int i=0;i<input.length();i++)
		{
		separate.add(i, input.charAt(i));	
		}
		List<Character> unique=separate.stream().filter(i->Collections.frequency(separate,i)==1).collect(Collectors.toList());
		System.out.println("The first non-repeated character in the String is "+unique.get(0));

	}

}
