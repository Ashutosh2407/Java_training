package task8;

import java.util.Arrays;
import java.util.List;

public class Seven {

	public static void main(String[] args) {
		
		List<String> nam = Arrays.asList("ashu","ritu","jake","mushike");
		nam.stream().filter(name -> name.charAt(name.length()-1)=='e').forEach(System.out::println);

	}

}
