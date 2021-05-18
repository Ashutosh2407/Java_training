package task8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Eight {

	public static void main(String[] args) {
		String line ="";
		List<Integer> age = new ArrayList<Integer>();
		int iter = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("csv_file.csv"));
			while((line = br.readLine()) != null) {
				if(iter ==0) {
					iter++;
					continue;
				}
				String[] employee = line.split(",");
				age.add(Integer.parseInt(employee[1]));
				
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(age.stream().mapToInt(x->x).average());

	}

}
