import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("Please enter the sentence");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String rev = string_reverse(input);
		System.out.println(rev);

	}
	
	public static String string_reverse(String input) {
		String[] words = input.split(" ");
		String rev ="";
		for(int i =0; i < words.length;i++) {
			String revword ="";
			String word = words[i];
			for(int j = word.length()-1; j>=0;j--) {
				revword = revword + word.charAt(j);
			}
			rev = rev + revword + " ";
			
		}
		return rev;
	}

}
