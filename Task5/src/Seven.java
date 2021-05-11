import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String new_string ="";
		System.out.println("Please enter the string");
		String input = sc.nextLine();
		for(int i =0; i < input.length();i++) {
			if(Character.isUpperCase(input.charAt(i))) {
				char b = input.charAt(i);
				b = Character.toLowerCase(b);
				new_string = new_string + b;
			}
			else {
				char b = input.charAt(i);
				b = Character.toUpperCase(b);
				new_string = new_string + b;
			}
		}
		System.out.println("The new string is "+new_string);

	}

}
