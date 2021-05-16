package task7;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Eleven {
	
	static Map<String, Integer> map = new HashMap<>();
	
	public static void sortbykey() {
		TreeMap<String , Integer> sorted = new TreeMap<>();
		sorted.putAll(map);
		
		for(Map.Entry<String, Integer> entry: sorted.entrySet()) {
			System.out.println("Key "+entry.getKey() + " : "+entry.getValue());
		}
	}
	
	
	

	public static void main(String[] args) {
		map.put("A",5);
		map.put("B",4);
		map.put("C",3);
		map.put("D",2);
		map.put("E",1);
		sortbykey();
		
	}

}
