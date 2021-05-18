package task8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Six {

	public static void main(String[] args) {
		FileWriter obj;
		try {
			obj = new FileWriter("Output_3.txt");
			List<Integer> val = Arrays.asList(2,5,454,87,5,74,17,1,7,8);
			List<Integer> squarelist = val.stream().map(x->x*x).collect(Collectors.toList());
			for(Integer num:squarelist) {
				obj.write(num.toString());
				obj.write("\n");
			}
			obj.close();

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
