import java.util.HashMap;
import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		
		System.out.println("Enter a word");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(check_isogram(word));
	
	}
	
	public static boolean check_isogram(String word) {
		int[] hm = new int[26];
		int length = word.length();
		for(int i= 0; i < length;i++) {
			hm[word.charAt(i) - 'a']++;
			
			if (hm[word.charAt(i)- 'a']>1) {
				return false;
			}
		}
		return true;
	}

}
