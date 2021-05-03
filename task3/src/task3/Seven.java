package task3;

import java.util.HashMap;
import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		HashMap<Integer, String> months = new HashMap<Integer, String>();
		months.put( 1, "January");
		months.put( 2, "February");
		months.put( 3, "March");
		months.put( 4, "April");
		months.put( 5, "May");
		months.put( 6, "June");
		months.put( 7, "July");
		months.put( 8, "August");
		months.put( 9, "September");
		months.put( 10, "October");
		months.put( 11, "November");
		months.put( 12, "December");
		
		HashMap<Integer, Integer> days = new HashMap<Integer, Integer>();
		days.put(1, 31);
		days.put(2,28);
		days.put(3, 31);
		days.put(4, 30);
		days.put(5, 31);
		days.put(6, 30);
		days.put(7, 31);
		days.put(8, 31);
		days.put(9, 30);
		days.put(10, 31);
		days.put(11, 30);
		days.put(12, 31);
		
		System.out.println("Please enter a number");
		int number = sc.nextInt();
		int year = sc.nextInt();
		if (year %4 == 0 && number == 2) {
			System.out.println("February 2016 has 29 days");
		}
		else {
			System.out.printf(months.get(number) +" " + year + " has " +days.get(number)+ " days.");
		}
		

	}

}
