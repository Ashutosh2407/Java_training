	package task8;

import java.util.ArrayList;
import java.util.List;

public class Five {

	public static void main(String[] args) {
		String input = "never give up";
		String[] word = input.split(" "); 
		List<String> list = new ArrayList<String>();
		for(String w:word) {
			list.add(w);
		}
		list.stream().map(x->x.toUpperCase()).forEach(System.out::print);
		

	}

}
