package task6;

class Employee{
	String name;
	int year_of_joining;
	int salary;
	String address;
	
	
	Employee(String name, int year_of_joining,int salary,String address){
		this.name = name;
		this.year_of_joining = year_of_joining;
		this.salary = salary;
		this.address = address;
	}
	
	void print_header() {
		System.out.println("Name\tYear of Joining\tAddress");
	}
	
	void print() {
		System.out.println(this.name + "\t" + this.year_of_joining + "\t"+this.address);
	}
}


public class Two {

	public static void main(String[] args) {
		Employee em1 = new Employee("Robert",1994,75000,"64C- Walls Streat");
		Employee em2 = new Employee("Sam",2000,85000,"68D- Walls Streat");
		Employee em3 = new Employee("John",1999,95000,"26B- Walls Streat");
		
		Employee[] values = {em1,em2,em3};
		em1.print_header();
		for(int i =0; i< values.length;i++) {
			values[i].print();
		}

	}

}
