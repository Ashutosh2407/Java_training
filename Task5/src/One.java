
public class One {

	public static void main(String[] args) {
		String[] words = {"Hi", "Hello","What","Inform"};
		int l = Integer.MAX_VALUE;
		for(int i=0; i < words.length;i++) {
			if (words[i].length() < l) {
				l = words[i].length();
			}
		}
		
		System.out.println("The length is "+l);

	}

}
