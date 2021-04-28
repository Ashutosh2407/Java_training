package task2;
import java.util.ArrayList;
import java.util.Scanner;



public class Nine {

	public static void main(String[] args) {
		ArrayList<Character> ch = new ArrayList();
		ch.add('r');
		ch.add('a');
		ch.add('n');
		ch.add('d');
		ch.add('o');
		ch.add('m');
		System.out.println("Please enter a character");
		Scanner sc = new Scanner(System.in);
		char input = Character.toLowerCase(sc.next().charAt(0));
		if (ch.contains(input)) {
			System.out.println("FOUND");
		}
		else {
			System.out.println("NOT FOUND");
		}

	}

}
