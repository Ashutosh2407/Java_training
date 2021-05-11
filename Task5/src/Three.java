import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		System.out.println("Please enter a string");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(input.replaceAll(" ", ""));
		

	}

}
